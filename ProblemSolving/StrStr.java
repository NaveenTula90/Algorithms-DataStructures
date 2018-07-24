package ProblemSolving;

public class StrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hayStack="hello";
		String needle="ll";
		
		System.out.println(indexOf(hayStack,needle));
	}

	private static int indexOf(String hayStack, String needle) {
		// TODO Auto-generated method stub
		
		int l1=hayStack.length();
		int l2=needle.length();
		
		System.out.println("hii");
		if(l1<l2) {
			return -1;
		}else if(l2==0) {
			return 0;
		}
		
		
		for(int i=0;i<=l1-l2;++i) {
			if(hayStack.substring(i,i+l2).equals(needle)) {
				return i;
			}
		}
		
		
		return -1;
	}

}
