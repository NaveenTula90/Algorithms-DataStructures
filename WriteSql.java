import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Writer writer = null;

		try {
			InputStream is = new FileInputStream(
					"C:/Users/ntula/Desktop/List of Production Conditions_05_16_2018.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(is);
			XSSFSheet sheet = wb.getSheetAt(0);

			File file = new File("C:/Users/ntula/Desktop/RTL-16411.sql");
			writer = new BufferedWriter(new FileWriter(file));
			Iterator rows = sheet.rowIterator();
			StringBuilder sb = new StringBuilder();
			while (rows.hasNext()) {
				// String sqlQuery = "update t_conditiontemplate set name ="1" where
				// sequenceidentifier="2"";
				XSSFRow row = (XSSFRow) rows.next();
				// System.out.println("\n");

				Iterator cells = row.cellIterator();

				writer.write("");
				sb.append("update t_conditiontemplate");

				while (cells.hasNext()) {
					XSSFCell cell = (XSSFCell) cells.next();

					if (cell.getColumnIndex() == 0) {
						sb.append(" set name =\"");
						String displayName = cell.getStringCellValue();
						sb.append(displayName + "\"");

					}
					if (cell.getColumnIndex() == 1) {
						sb.append(" set description=\"");
						String desc = cell.getStringCellValue();
						sb.append(desc);
					}
					if (cell.getColumnIndex() == 2) {
						sb.append("\" where sequenceidentifier=\"");
						String seqIdentifier = cell.getStringCellValue();
						sb.append(seqIdentifier);

					}

				}

				sb.append("\";");
				sb.append("\n");
			}

			System.out.println(sb);

			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
