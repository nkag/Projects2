package neha_practice;
/**
 * This prints a matrix in spiral order. 
 *   2   4   6   8 
 *   5   9   12  16
 *   2   11   5   9
 *   3    2   1   8
 *
 * 
 *Spiral order printing returns 2,4,6,8,16,9,8,1,2,3,2,5,9,12,5,11
 * @author KANNE03
 * https://www.youtube.com/watch?v=siKFOI8PNKM
 */
public class SpiralOrderMatrix {
	
	public static void main(String[] args){
	int[][] A={{2,4,6,8},
			   {5,9,12,16},
			   {2,11,5,9},
			   {3,2,1,8}
	};
	int m=A.length; //no of rows in A=4
	int n =A[0].length; //no of columns in A=4;
//	PrintSpiral(A[][], m,n );
	PrintSpiral(A,m,n);
	}
//now the funcion for spiral prnting.
	
	public static void PrintSpiral(int[][] arr, int rows, int columns)
	{
		int T=0;
		int B=rows-1;
		int L=0;
		int R=columns-1;
		int dir=0;
		//dir=0:left to right.
		//dir=1:top to bottom
		//dir=2:right to left
		//dir=3:bottom to top
		
		while(T<=B && L<=R)
		{  
			 if(dir==0){
				 
				 for(int i=L; i<=R; i++)
				 {  System.out.print(arr[T][i]+",");
				 }
			 T++;
		//dir=1;
			
		}
		
		//Now for dir=1 ie dir=top to bottom
		else if (dir==1){
			for(int i=T; i<=B; i++)
			{ System.out.print(arr[i][R] +",");}
			R--;
			//dir=2;
		}
		else if (dir==2){
		for(int i=R; i>=L; i--)
		{ System.out.print(arr[B][i]+",");}
		  B--; 
		 // dir =3;
		}
		
		else if(dir==3)
		{
			for(int i=B; i>=T; i--)
			{ System.out.print(arr[i][L]+",");}
			L++;
			
		}
		dir=(dir+1)%4;
	}
}
}
