package ProblemSolving;

import java.util.LinkedList;
import java.util.Scanner;


public class EnglishInt {

	static String smalls[]= {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
			"Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	static String tens[]= {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
		"Eighty", "Ninety"};
	static String[] bigs = {"", "Thousand", "Million", "Billion"};
	static String hundred = "Hundred";
	static String negative = "Negative";
	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number to be converted");
		int num= sc.nextInt();
		
		System.out.print(convertIntEng(num));
		
		
		sc.close();
		
		
		}

	private static String convertIntEng(int num) {
		// TODO Auto-generated method stub
		
		
		if(num==0) {
			return smalls[0];
		}else if(num <0) {
			return negative+""+convertIntEng(num);
		}
		
		LinkedList<String> parts =new LinkedList<String>();
		int chunksCount=0;
		while (num>0) {
		if(num%1000!=0) {
			String part = convertHundered(num%1000)+ " "+ bigs[chunksCount];
			parts.addFirst(part);

			}
		num/=1000;
		chunksCount++;
		}
		return ListToString(parts);
	}

	private static String convertHundered(int num) {
		// TODO Auto-generated method stub
		LinkedList<String> parts =new LinkedList<String>();
		
		if(num>=100) {
			parts.addLast(smalls[num/100]);
			parts.addLast(hundred);
			num%=100;
		}
		
		if(num>=10&&num<20) {
			parts.addLast(smalls[num]);
		}else if(num>=20) {
			parts.addLast(tens[num/10]);
			num%=10;
		}
		
		if(num>=1&&num<10) {
			parts.addLast(smalls[num%10]);

		}
		return ListToString(parts);
	}

	private static String ListToString(LinkedList<String> parts) {
		// TODO Auto-generated method stub
		
		StringBuilder sb =new StringBuilder();
		while(parts.size()>1) {
			sb.append(parts.pop());
			sb.append(" ");
		}
		sb.append(parts.pop());
		return sb.toString();
	}
		
	

}
