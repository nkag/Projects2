package neha_practice;
import java.util.*;
/*
 * Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, 
 * such that there is a bijection between a letter in pattern and a non-empty word in str.
 * 
 * ex:
 * 1. pattern="abba" , str="dog cat cat dog" should return true.
 * 2. pattern="abba" , str="dog cat cat fish" should return false.
 * 3. pattern="aaaa" , str="dog cat cat dog" should return false
 */


public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="abba";
		String str="dog cat cat dog";
		boolean result=IsWordMatchingPattern(pattern, str);
		System.out.println(result);

	}
	
	public static boolean IsWordMatchingPattern(String pattern, String word)
	{
		
		char[] pattern_characters = pattern.toCharArray();
		//now u need hashmap to store mapping of characters(from pattern) and the string word(string). 
		
		String[] array_of_words=word.split(" ");

		if(pattern_characters.length!=array_of_words.length || pattern_characters.length==0 || array_of_words.length==0 )
			return false;
		HashMap<Character, String> hm=new HashMap<Character, String>();
		//now, iterate over all characters in pattern and store it's corresponding string in the hashmap.
		for(int i=0; i<pattern_characters.length;)
		{
			if(hm.containsKey(pattern_characters[i]))
			{
			     i++;	
			}
			//if key is not present in hashmap, then u add that mapping in hm. 
			else{
				hm.put(pattern_characters[i], array_of_words[i]);
			}
		}
		
		//now to check for valiity once the hashmap containing the mapping is created.
		for(int i=0; i<pattern_characters.length;i++)
		{
		if(!hm.get(pattern_characters[i]).equals(array_of_words[i]))
		{
			return false;
			
		}
		}
		


		return true;
	
	//	return false;
	}

}
