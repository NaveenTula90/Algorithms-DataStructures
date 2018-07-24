import java.util.Scanner;

public class ReverseWordString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s =sc.nextLine();
		System.out.println(reverseWord(s));
		sc.close();
	}

	private static String reverseWord(String s) {
		
		String[] sArr =s.split(" ");
		
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<sArr.length;i++) {
			
			String reverseString = reverseString(sArr[i]);
			sb.append(reverseString);
			
			if(i!=sArr.length-1) {
			sb.append(" ");}
		}
		
		return sb.toString();
	}

	private static String reverseString(String string) {		
		char [] stringChar=string.toCharArray();
		
		for(int i =0;i<stringChar.length/2;i++) {
			int right =stringChar.length-1-i;
			char temp = stringChar[right];
			stringChar[right]=stringChar[i];
			stringChar[i]=temp;
		}
		
		return new String(stringChar);
		
	}

}
