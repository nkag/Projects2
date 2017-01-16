package neha_practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1= "111";
	String s2="101";
	System.out.println(CAlcBinarySum(s1,s2));
	}

	public static String CAlcBinarySum(String a, String b)
	{
		//if(a.length()==0 )
		int i= a.length()-1;
		int j=b.length()-1;
		
		StringBuilder sb=new StringBuilder();
		int carry=0;
		while(i>=0 || j>=0)
		{
			int sum=0;
			if(a.charAt(i)=='1' && i>=0)
				sum++;
			if(b.charAt(j)=='1' && j>=0)
				sum++;
			sum=sum+carry;
			if(sum>=2)
				carry=1;
			else 
				carry=0;
			
			sb.insert(0, (char) ((sum%2)+'0'));
			i--;
			j--;
			
			
		}
		if(carry==1)
			sb.insert(0, '1');
		return sb.toString();
	}
}
