import java.util.*;

public class URLify{

	//Without in place operations
	public static String Urlify(String s){
		StringBuilder sb = new StringBuilder();
		for(char c: s.toCharArray()){
			if(c != ' '){
				sb.append(c);
			}else{
				sb.append("%20");
			}
		}
		return sb.toString();
	}

	//In place operations
	public static String Urlify2(String s, int length){
		int space = 0;
		for(char c: s.toCharArray()){
			if(c == ' '){
				space++;
			}
		}
		int newLength = length + space*2;
		Character[] newString = new Character[newLength];
		int j=0;
		for(int i = 0; i < length; i++){
			if(s.charAt(i) == ' '){
				System.out.println(s.charAt(i) + " "+  j);
				newString[j] = '%';
				newString[j+1] = '2';
				newString[j+2] = '0';
				j = j+3;
			}else{
				System.out.println(s.charAt(i) + " "+  j);
				newString[j] = s.charAt(i);
				j++;
			}
		}
		return Arrays.toString(newString);
	}

	public static void main(String args[]){
		System.out.println(Urlify("Mr John Smith"));
		System.out.println(Urlify2("Mr John Smith", 13));
	}
}