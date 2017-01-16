package neha_practice;
import java.util.*;
public class IsomorphicStrings {

	public static void main(String []args)
	{
		String s1="add";
		String s2="egg";
		boolean result=	isIsomorphic(s1,s2);
		System.out.println("call to function made");
		System.out.println(result);
		
	}
	
	public static boolean isIsomorphic(String s1, String s2){
		
		if(s1 == null || s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false; 
		//now u create the hashmap coz u have validated 2  main conditions for isomorphic ie same length strings 
		//and not null strings. .

		HashMap<Character, Character> hm= new HashMap<Character, Character>();
		
		for(int i=0; i<s1.length(); i++)
		{
			char c1=s1.charAt(i);  //first run, c1=a.
			char c2=s2.charAt(i); //first run, c2=e.
		
			if(hm.containsKey(c1)){
	            if(hm.get(c1)!=c2)// if not consistant with previous ones
	                return false;
	        }else{
	            if(hm.containsValue(c2)) //if c2 is already being mapped
	                return false;
	            hm.put(c1, c2); //so u put in c1 & c2 in the hm only after seeing if neither c1 or c2 are in either the key or the value of the hm. 
	        }
		
		
		
	}
		return true;                 // hm should look like this: 
		                             //  a->e
	}                                //  d->g
									 //  d->g. 
}
