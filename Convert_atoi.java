package neha_practice;


/* Implement atoi to convert a string to an integer.

http://www.programcreek.com/2012/12/leetcode-string-to-integer-atoi/

 * The following cases should be considered for this problem:

1. null or empty string
2. white spaces
3. +/- sign
4. calculate real value
5. handle min & max
 */
public class Convert_atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str2="-52";
	int d= ConvertAtoI(str2);
		System.out.println(d);

	}
	
	public static int ConvertAtoI(String str)
	{
		//check if string is null
		if(str==null || str.length()<1)
			return 0;
		
		//now trim any whitespaces in the string;
		str=str.trim();
		
		int i=0;
		char flag='+';
		//now chwck if the string starts with + or -
		if(str.charAt(0)=='-')
		{
			flag='-';
			i++;
		}
		else if(str.charAt(0)=='+')
		{
			i++;
		}
			
		double result=0;
	
		int length=str.length();
		
		while(i<length)
		{
			result=(result*10) +(str.charAt(i)-'0');
			i++;
		}
		//System.out.println("The converted value of input string to integer is"+ result);
		if(flag=='-')
			result=-result;
		
		//Handling edge cases for max and min
		if(result>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result<Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		System.out.println("The converted int is");
		return (int) result;
		
	}

}
