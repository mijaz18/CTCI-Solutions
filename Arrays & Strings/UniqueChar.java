import java.util.*;

public class UniqueChar{

	//If not allowed any extra data structure
	public static boolean isUnique(String s){
		for(int i = 0; i < s.length(); i++){
			for(int j = i+1; j < s.length(); j++){
				char currI = s.charAt(i);
				char currJ = s.charAt(j);
				if(currI == currJ){
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isUnique2(String s){
		boolean[] set = new boolean[128];
		for (char c: s.toCharArray()){
			if(set[c] == true){
				return false;
			}
			set[c] = true;
		}
		return true;
	} 

	public static void main(String args[]){
		System.out.println(isUnique("abcbjbjbaaannn"));
		System.out.println(isUnique2("abc"));
	}
}