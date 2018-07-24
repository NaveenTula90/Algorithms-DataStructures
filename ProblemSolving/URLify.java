package ProblemSolving;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		String s = sc.nextLine();
		System.out.println("Enter the length of String");
		int len = sc.nextInt();
		String urifiedString = Urify(s,len);
		System.out.println(urifiedString);
		sc.close();

	}

	private static String Urify(String s, int len) {
		char [] ch = s.toCharArray();
		
		int count =0;
		for(int i=0;i<len;i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		
		int index=len+count*2;
		for(int i=len-1;i>=0;i--) {
			
			if(ch[i]==' ') {
				ch[index-1]='0';
				ch[index-2]='2';
				ch[index-3]='%';				
			}else {
				ch[index-1]=ch[i];
				index--;
			}
		}
		
		return new String(ch);
	}

}
