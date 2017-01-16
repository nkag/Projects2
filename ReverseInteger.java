package neha_practice;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPalindromeValue=IsPalindrome(121);
	//	int reverseValue= ReverseIntegerNumber(-123);
		//System.out.println("The reversed value is"+reverseValue);
         System.out.println("The result for isPalindrome is"+ isPalindromeValue);
	}
	
	public static int ReverseIntegerNumber(int x)
	{
	     int rev=0;
	     while(x!=0)
	{
	           rev= (rev*10) + (x%10);
	           x=x/10;
	}

	return rev;
	}
	
	public static boolean IsPalindrome(int a)
	{
		if(a<0)
			return false;
		return (a==ReverseIntegerNumber(a));
	}
	

}
