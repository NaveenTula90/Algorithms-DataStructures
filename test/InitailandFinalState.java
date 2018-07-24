package test;

public class InitailandFinalState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intialString="aba_a";
		String FinalString="_baaa";
		
		if(intialString.length()!=FinalString.length()) {
			return ;
		}
		
		if(intialString==FinalString) {
			System.out.println("0");
			System.exit(0);

		}
		if(intialString.length()==2||intialString.length()==3) {
			System.out.println("1");
			System.exit(0);
		}
		
		int indexS1 = intialString.indexOf('_');
		int indexS2 = FinalString.indexOf('_');
		
		int i=0;
		if(indexS1>indexS2) {
			i=-1;
		}else {
			i=1;
		}
		int count=0;
		while(indexS1!=indexS2&&(2<=indexS1+i*2 && indexS1+i*2<=intialString.length()-1)) {
			
			if(intialString.charAt(indexS1+i)!=intialString.charAt(indexS1+i*2)) {
				intialString = swap(intialString,indexS1,indexS1+i*2);
				indexS1 = indexS1+i*2;
				count++;
			}else {
				intialString = swap(intialString,indexS1,indexS1+i*1);
				count++;
				indexS1 = indexS1+i*1;
			}
			
		}
		
	
			
			if(indexS1+i*2==2||indexS1+i*2==intialString.length()-1) {
				if(intialString.charAt(indexS1+i)!=intialString.charAt(indexS1+i*2)) {
					intialString = swap(intialString,indexS1,indexS1+i*2);
					indexS1 = indexS1+i*2;
					count++;
				}else {
					while(indexS1!=indexS2) {
					intialString = swap(intialString,indexS1,indexS1+i*1);
					count++;
					indexS1 = indexS1+i*1;
					}
				}
			}
	
		System.out.println(count);
	}

	private static String swap(String intialString, int indexS1, int i) {
		// TODO Auto-generated method stub
		
		char[] str =intialString.toCharArray();
		 char temp = str[indexS1];
		 str[indexS1]=str[i];
		 str[i]=temp;
		
		return new String(str);
		
	}

}
