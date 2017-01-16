package neha_practice;
import java.util.*;
//import java.io.*;

public class ParenthesesMatching { 

	public static void main(String[] args)
	{
		String str= "}{}()[]"; //check difference between string and string array. 
		String str2= "{}()[]";																																																																																																																														
		boolean result = checkMatching(str2);
		System.out.println("answer is"+ result);
		
	}
	
	public static boolean checkMatching(String s)
	{
	   HashMap<Character, Character> hm = new HashMap<Character, Character>();
	   hm.put('(', ')');
	   hm.put('{', '}');
	   hm.put('[', ']');
	//   hm.put('[', '&');
	   
	   Stack<Character> stack1= new Stack<Character>();
	   for(int i=0; i<s.length(); i++)
	   {
		   char current = s.charAt(i);
		   if(hm.containsKey(current))  //checking the key part of hm with the string's character, ie, comparing str with hm. 
		   {
			   stack1.push(current); //pushing to stack only if hm contains current coz u want only parentheses pushed to the stack and nothing else, say if str="w{}()", u dont want w in the stack. ". 
		   }
		   
		                           //checking the value part of hm with the string's character.
		   
		   else if(hm.containsValue(current))
					   {
				             if(!stack1.empty() && hm.get(stack1.peek()) == current)
				             {
				            	 stack1.pop();
				             }

							   else{
								   
								   return false;
							   }
				            
					   }
		   
					
					   }
			
	   

	   
	   return stack1.isEmpty();
		
	}
	
}
