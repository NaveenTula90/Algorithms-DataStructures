package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{ 
	
	public static void main(String ... args) {
		int logFileSize = 5;
		List<String> logFile = new ArrayList<String>();
		logFile.add("al 9 2 3 1");
		logFile.add("g1 Act car");
		logFile.add("zo4 4 7");
		logFile.add("abl off KEY dog");
		logFile.add("a8 act zoo");
		logFile =reorderLines(logFileSize,logFile);
		
		logFile.forEach(System.out::println);
	}
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<String> reorderLines(int logFileSize, List<String> logfile) 
	{
    	
    	Collections.sort(logfile,new LogComparator());
    	return logfile;
	}
	// METHOD SIGNATURE ENDS
}

class LogComparator implements Comparator<String>{


	@Override
	public int compare(String s1, String s2) {
		String[] sarray1  =s1.split("");
		String[] sarray2 = s2.split("");
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for(int i =1;i<sarray1.length;i++) {
			sb1.append(sarray1[i]);
			
		}
		
		for(int i =1;i<sarray2.length;i++) {
			sb2.append(sarray2[i]);
			
		}
		
		int comp= sb1.toString().compareTo(sb2.toString());
				if(comp == 0) {
					return sarray1[0].compareTo(sarray2[0]);
				}
		return comp;
	}
	
}