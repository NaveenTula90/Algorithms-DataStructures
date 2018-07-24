package ProblemSolving;

public class BuddyStrings {

	public static void main(String[] args) {

		String s1 = "aaaaaaabc";
		String s2 = "aaaaaaacb";
		System.out.println(isBuddyStrings(s1, s2));
	}

	private static boolean isBuddyStrings(String s1, String s2) {
		boolean isBuddy=false;
		if(s1.equals(s2)) {
			
			int[] charCount = new int[26];
			
			for(int i=0;i<26;i++) {
				charCount[s1.charAt(i)-'a']++;
			}
			
			for(int c:charCount) {
				
				if(c>1)
					return true;
				return false;
			}
		}
		
		else {
			int first=-1,second=-1;
			for(int i=0;i<s1.length();i++) {
				
				if(s1.charAt(i)!=s2.charAt(i)) {
					
					if(first==-1) {
						first=i;
					}else if(second==-1) {
						second =i;
					}else {
						return false;
					}
				}
			}
			
			isBuddy= (second!=-1&&s1.charAt(first)==s2.charAt(second)&&s1.charAt(second)==s2.charAt(first));
		}
		return isBuddy;
	}
	
}
