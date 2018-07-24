
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="A man, a plan, a canal: Panama";
		
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		
		int left=0,right=s.length()-1;
		
		String[] sArr=s.split("");
		while(left<right) {
			
			
			if(sArr[left].matches("[a-zA-Z0-9]")&&sArr[right].matches("[a-zA-Z0-9]")) {
				
				if(sArr[left].toLowerCase()==sArr[right].toLowerCase()) {
					left++;
					right--;
				}else {
					return false;
				}
			}else if(!sArr[left].matches("[a-zA-Z0-9]")) {
				left++;
				
			}else if(!sArr[right].matches("[a-zA-Z0-9]")){
				right--;
			}
			
		}
		
		return true;
	}

}
