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

	public static void main(String args[]){
		System.out.println(Urlify("Mr John Smith"));
	}
}