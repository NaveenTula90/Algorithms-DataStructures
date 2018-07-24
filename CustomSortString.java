import org.apache.poi.ss.formula.functions.T;

public class CustomSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="cba";
		String T="abcd";
		
		String ans= customSort(S,T);
		System.out.println(ans);

	}

	private static String customSort(String s, String t) {
		
		StringBuilder sb = new StringBuilder();
		char[] tArr=t.toCharArray();
		for(int i=0;i<s.length();i++) {
			
			for(int j=0;j<t.length();j++) {
				
				if(s.charAt(i)==tArr[j]) {
					sb.append(s.charAt(i));
					tArr[j]='#';
				}
			}
			
		}
		
		for(int j=0;j<tArr.length;j++) {
			if(tArr[j]!='#') {
				sb.append(tArr[j]);
			}
		}
		
		
		return sb.toString();
	}

	

}
