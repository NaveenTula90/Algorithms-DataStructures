import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String s =sc.next();
		char[] array = s.toCharArray();
		for(int i =0;i<=array.length/2;i++) {
			
			int rightIndex= array.length-1-i;
			char temp=array[rightIndex];
			array[rightIndex]=array[i];
			array[i]=temp;
			
		}
		
		System.out.println("reverse string"+ new String(array));
		sc.close();
		

	}

}
