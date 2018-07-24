
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="w3resource";		
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
