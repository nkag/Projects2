package neha_practice;

public class MultiplicationTable {
	
	public static void main(String[] args){
		int n=12;
		multiplication(n);
	}
	
	public static void multiplication(int n){
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(String.format ( "%5d", j * i ));
			}
			System.out.println();
		}
	}

}
