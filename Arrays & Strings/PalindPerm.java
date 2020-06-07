;import java.util.*;

public class PalindPerm {

	public static boolean isPalindPerm(String s){
		s = s.toLowerCase();
		s = s.replaceAll(" ", "");
		HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
		for (char c: s.toCharArray()){
			if(charCount.containsKey(c)){
				charCount.put(c, charCount.get(c) + 1);
			}else{
				charCount.put(c, 1);
			}
		}

		System.out.println(charCount.toString());
		if(s.length() % 2 == 0){
			for(int i: charCount.values()){
				if(i % 2 != 0){
					return false;
				}
			}
			return true;
		}else{
			int oddCount = 0;
			for(int i: charCount.values()){
				if(i % 2 != 0){
					oddCount++;
					if(oddCount > 1){
						return false;
					}
				}
			}
			return true;
		}
	}

	public static void main(String args[]){
		System.out.println(isPalindPerm("Tact Coa"));
	}
}