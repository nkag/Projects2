package neha_practice;
//given 2 binary strings, 1 and 11, return their sum=100, which is also a binary string. 

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="111";
String s2="101";
System.out.println(CalcBinarySum(s1,s2));
		
	}
	
	public static String CalcBinarySum(String a, String b)
	{
		int i=a.length()-1;
		int j=b.length()-1;
		
		StringBuilder sb=new StringBuilder();
      int carry=0;
		while(i>=0 || j>=0)
		{
			int sum=0; 
			if(i>=0 && a.charAt(i)=='1')
			{
				sum++;
			}
			if(j>=0 && b.charAt(j)=='1')
			{
				sum++;
			}
			sum=sum+carry;
			if(sum>=2)
				carry=1;
			else
				carry=0;

	       sb.insert(0,  (char) ((sum%2)+'0' ));
	 
		//	sb.insert(0, (char) sum%2 +'0');
			i--;
			j--;
			
		}
		if(carry==1)
			sb.insert(0, '1');
		return sb.toString();
	}

}
