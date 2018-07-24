
import java.sql.Timestamp;
//import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;





public class UTCDateTime {

	public static void main(String[] args) {
		
		/*LocalDateTime dt = LocalDateTime.now();
		dt.toInstant(ZoneOffset.UTC);
		System.out.println("dt "+dt);*/
		
		Timestamp timestamp = null;
		DateTime dt1= new LocalDateTime(timestamp.getTime()).toDateTime(DateTimeZone.UTC);  
		

	}

}
