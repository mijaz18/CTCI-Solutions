import java.util.*;

	//Naive implementation
	/*Comments: A better way would've been to iterate through the character array and see the next character instead of using the stack.
	However, the question doesn't state what the space and time complexity is required so I've used an extra data structure.
	*/

public class StringCompression{

	public static String stringCompression(String s){
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		int length = 0;
		int freq = 0;
		
		for(char c: s.toCharArray()){
			if(stack.isEmpty() || stack.peek() == c){
				if(!stack.isEmpty()){
				}
				freq++;
			}else{
				sb.append(stack.peek());
				if(freq > 1){
					sb.append(freq);
				}
				freq = 1;
			}
			length++;
			if(length == s.length()){
				if(stack.peek() == c){
					sb.append(stack.peek());
					if(freq > 1){
						sb.append(freq);
					}
				}else{
					sb.append(c);
				}
			}
			stack.push(c);
		}
		String rt = sb.toString();
		if(rt.length() == s.length()){
			return s;
		}
		return rt;
	}

	public static void main(String args[]){
		System.out.println(stringCompression("aaaaaabbbbbbbbccccdddddeeeehhhh"));
	}
}