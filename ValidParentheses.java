package neha_practice;
import java.util.*;
/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * 
 */
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(()[]{}";
		boolean result=isValidParentheses(s);
		System.out.println(result);

	}
	
	public static boolean isValidParentheses(String str)
	{
		if(str==null)
			return false;
		char[] strChars=str.toCharArray();
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		Stack<Character> stack1= new Stack<Character>();
		hm.put('(', ')');
		hm.put('{', '}');
		hm.put('[', ']');
		for(int i=0; i<strChars.length;i++)
		{
			char current=strChars[i];
			    if(hm.containsKey(current)==true)
			     {
				  stack1.push(current);
			     }
			    
			    else if(hm.containsValue(current))
			    {
			    	if(stack1.isEmpty()!=true && hm.get(stack1.peek())==current)
			    	 {
			    	          stack1.pop();	
			    	 }
			    }
			    
			    else
			    	return false;
			
		}
		return stack1.isEmpty();
		
	}

}
