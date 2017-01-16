
package neha_practice;
/**
 *Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order. For example, given n = 4,

[
[1,   2,  3, 4], 
[12, 13, 14, 5], 
[11, 16, 15, 6], 
[10,  9,  8, 7]
]
Question from: http://www.programcreek.com/2014/05/leetcode-spiral-matrix-ii-java/
Solution like spiral printing of a matrix from youtube link below. 
 * 
 *Spiral order printing returns 2,4,6,8,16,9,8,1,2,3,2,5,9,12,5,11
 * @author KANNE03
 * https://www.youtube.com/watch?v=siKFOI8PNKM
 */
public class SpiralMatrixGenerateNumber {
	
	public static void main(String[] args){
		int[][] A=new int[4][4];
	int m=A.length; //no of rows in A=4
	int n =A[0].length; //no of columns in A=4
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
		int start=1;
		while(T<=B && L<=R && start<=rows*columns)
		{  
			
			 if(dir==0){
				 
				 for(int i=L; i<=R; i++)
		
				 {  arr[T][i]=start;
					// System.out.print(arr[T][i]+",");
					 start++;
				 }
			 T++;
			 
		//dir=1;
			
		}
		
		//Now for dir=1 ie dir=top to bottom
		else if (dir==1){
			for(int i=T; i<=B; i++)
			{   arr[i][R]=start;
				//System.out.print(arr[i][R] +",");
				start++;
				}
			R--;
			//dir=2;
		}
		else if (dir==2){
		for(int i=R; i>=L; i--)
		{   arr[B][i]=start;
		//	System.out.print(arr[B][i]+",");
			start++;
			}
		  B--; 
		 // dir =3;
		}
		
		else if(dir==3)
		{
			for(int i=B; i>=T; i--)
			{   arr[i][L]=start;
			//	System.out.print(arr[i][L]+",");
				start++;
				}
			L++;
			
		}
		dir=(dir+1)%4;
	}

		System.out.println("the generated matrix is");
	for(int i=0;i<4;i++){
	for(int j=0; j<4; j++){
             System.out.print(arr[i][j]+",");		
	}
	System.out.println();
	}
	}
}
