package neha_practice;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fizzbuzz(1,9);
		
	}

	public static String[] fizzbuzz(int a, int b)
	{
		for(int i=a; i<=b; i++)
		{
			
			if(i%3==0 && i%5==0)
			{
				return new String[] {"fizzbuzz"};
			}
			else if(i%3==0 && i%7==0)
			{
				return new String[] {"fizzpop"};
			}
			else if(i%5==0 && i%7==0)
			{
				return new String[] {"buzzpop"};
			}
			else if(i%3==0 && i%5==0 && i%7==0)
			{
				return new String[] {"fizzbuzzpop"};
			}
		//	else if(i==9)
			//{
				
		//	}
			
		else if(i%3==0)
			{
				return new String[] {"fizz"};
			}
			
			else if(i%5==0)
			{
				return new String[] {"buzz"};
			}
			else if(i%7==0)
			{
				return new String[] {"pop"};
			}
			else
			{
				return new String[] {Integer.toString(i)};
				
			}
		
		}
		return new String[] {"try again"};
	}
	//another approach is to use stringbuilder. append either fizz, buzz or pop depending on whatever the int is. only 4 
	//lines of code needed. 
	//if(i%3==0)
	//	sb.append fizz.
	//if(i%5==0)
	//sb.append buzz
	//if(i%7==0)
//	sb.append(pop)
//then u do the sb.substring for the 9 case. 
	//so this way u have just 4 lines of code. 
}
