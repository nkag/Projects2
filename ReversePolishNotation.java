package neha_practice;
import java.util.*;
//Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. 
//Each operand may be an integer or another expression. For example:
//["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6


public class ReversePolishNotation {

	public static void main(String[] args)
	{
		String[] tokens={"2","5","+","8","*"};
		int result= ArithemeticValue(tokens);
		System.out.println("Result is " + result);
		
		
	}
	
	public static int ArithemeticValue(String[] token)
	{
	  String valid_operators= "+-*/";
	  Stack<String> s1= new Stack<String>();
	  for(String i:token)
	  {
		  if(valid_operators.contains(i)!=true) //ie if numbers are encountered, push them to stack. 
		  {
			  s1.push(i);
		  }
		  
		  else{
			  int a=Integer.valueOf(s1.pop());
			  int b=Integer.valueOf(s1.pop());
			  switch(i)
			  {
			     
			  case "+": s1.push(String.valueOf(a+b)); //here, string.valueOf coz ur pushing sum of a&b, which is integer. but stack is of string data type. so to avoid type mismatch.
			            break;
			  case "-": s1.push(String.valueOf(a-b));
			            break;
			  case "*": s1.push(String.valueOf(a*b));
			            break;
			  case "/": s1.push(String.valueOf(b/a));
			            break;
			  
			  }
			  
		  }
		  
		  
	  }
		
	
	return(Integer.valueOf(s1.pop()));
	
}
}