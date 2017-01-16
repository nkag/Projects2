package neha_practice;
import java.util.*;
/*
 * Given a Roman numeral, convert it to an integer. Input is guarenteed to be within range of 1 to 3999
 * 
 * 
 */
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ConvertedIntegerValue= ConversionRomanToInt("III");
System.out.println(ConvertedIntegerValue);
	}
	
	public static int ConversionRomanToInt(String str)
	{
		if(str.length()==0 || str==null)
			return -1;
		int length=str.length();
		
		//Now, create a hashmap for maintining the mapping between a roman numeral and it's integer. 
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int result=hm.get(str.charAt(length-1));
		for(int i=str.length()-2; i>=0; i--)
		{
			if(hm.get(str.charAt(i+1)) <= hm.get(str.charAt(i))){
				result=result+hm.get(str.charAt(i));
				}
			else
				result= result-hm.get(str.charAt(i));
			
		}
		return result;
		
	}

}
