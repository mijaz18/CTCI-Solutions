import java.util.*;

public class IsPermut{
	public static boolean isPermut(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		HashMap<Character,Integer> sCount = new HashMap<Character,Integer>();
		HashMap<Character,Integer> tCount = new HashMap<Character,Integer>();
		for(int i=0; i<s.length(); i++){
			if(sCount.containsKey(s.charAt(i))){
				sCount.put(s.charAt(i), sCount.get(s.charAt(i))+1);
			}else{
				sCount.put(s.charAt(i), 1);
			}
			if(tCount.containsKey(t.charAt(i))){
				tCount.put(t.charAt(i), tCount.get(t.charAt(i))+1);
			}else{
				tCount.put(t.charAt(i), 1);
			}
		}
		if(sCount.equals(tCount)){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
		System.out.println(isPermut("abcc", "aabc"));
	}
}