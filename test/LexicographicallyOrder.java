package test;

public class LexicographicallyOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s = "babaabab";
		int minIndex = 0;
		int maxIndex = 0;
		int i =0;
		for(; i<s.length();i++) {
			if(s.charAt(i)=='b') {
				minIndex =i;
				break;
			}
		}
		
		for(;i<s.length();i++) {
			if(s.charAt(i)=='a' && i!=s.length()-1) {
				maxIndex =i;
			}
		}
		if(minIndex>0 && s.charAt(i)=='a') {
			maxIndex =i;
		}
		System.out.println(minIndex+" "+maxIndex);*/
		
	
			
	String s ="babaabab";
	int i =0;
	int pre_end=0;
	int end=0;
	int start =0;
	int count=0;
	int pre_count=0;
	
	while(i<s.length()) {
		if(s.charAt(i)=='b') {
			start=i;
			break;
		}
		i++;
	}
	
	for(;i<s.length();i++) {
		
		if(s.charAt(i)=='a') {
			count++;
			end=i;
		}else {
			if(count>pre_count) {
				pre_count=count;
				pre_end=end;
			}
			count=0;
		}
	}
	
	if(count>pre_count) {
		pre_end = end;
	}
	System.out.println(start+" "+pre_end);
	}

}
