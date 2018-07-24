import java.util.HashMap;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="stress";
		int count = 0;
		
		HashMap<Character, Integer> chCount = new HashMap<Character, Integer>();
		for (char c: s.toCharArray()) {
			System.out.println(c);
			if(chCount.containsKey(c)) {
		chCount.put(c, chCount.get(c)+1);}
			else {
				chCount.put(c, 1);
			}
		}
		
	
		
	}

}
