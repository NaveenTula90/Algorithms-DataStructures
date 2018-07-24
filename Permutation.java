import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		String str= sc.next();
		
		permutation(str,0,str.length()-1);
		
		sc.close();

	}

	private static void permutation(String str, int l,int r) {
		
		if(l==r) {
			//System.out.println();

			System.out.println(str);
		}else {
			for(int i =l;i<=r;i++) {
			str = swap(str,l,i);
			permutation(str, l+1, r);
			str =swap(str,l,i);
			}
		}
		
	}

	private static String swap(String str, int l, int i) {
		// TODO Auto-generated method stub
		
		char[] ch =str.toCharArray();
		char temp = ch[l];
		ch[l]=ch[i];
		ch[i]=temp;
		return String.valueOf(ch);
	}

}
