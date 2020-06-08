import java.util.*;

public class OneAway{
	public static boolean oneAway(String s, String t){
		if(s.length() == t.length()){
			//Replace
			int diff = 0;
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i) != t.charAt(i)){
					diff++;
				}
			}
			if(diff > 1){
				return false;
			}
			return true;
		}else{
			//Add and remove
			int diff = 0;
			int j = 0;
			String max = "";
			String comp = "";
			if(s.length() >= t.length()){
				max = s;
				comp = t;
			}else{
				max = t;
				comp = t;
			}
			//int maxLength = Math.max(s.length(), t.length());
			for(int i=0; i<max.length(); i++){
				if(i >= comp.length()){
					break;
				}
				System.out.println(max.charAt(i) + " " + comp.charAt(j) );
				if(max.charAt(i) != comp.charAt(j)){
					diff++;
					j = i;
				}else{
					j++;
				}
			}
			if(diff > 1){
				return false;
			}
			return true;
		}
	}

	public static void main(String args[]){
		System.out.println(oneAway("pale", "bake"));
	}
}