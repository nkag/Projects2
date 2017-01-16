package neha_practice;
/*
 * This is for rotating a matrix clockwise by 90 degrees and saving resultin another matrix. this does not
 * do it in-place as it uses a second array for saving the results. 
 */
public class RotateMatrix2d {

	public static void main(String[] args){
		int[][] A={
				  {1,   4,  7, 11, 15},
				  {2,   5,  8, 12, 19},
				  {3,   6,  9, 16, 22},
				  {10, 13, 14, 17, 24},
				  {18, 21, 23, 26, 30}
				};
		MatrixRotation(A);
	}
	
	public static void MatrixRotation(int[][] arr)
	{
		int[][] arr2=new int[5][5];
		int n=arr.length;
		for(int i=0; i<n;i++){
			for(int j=0; j<n; j++){
			//	int temp=arr[i][j];
			//	arr[i][j]=arr[j][n-1-i];
			//	arr[j][n-1-i]=temp;
			//	arr[j][n-1-i]=arr[i][j];
				arr2[j][n-1-i]=arr[i][j];
			}
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(arr2[i][j]+",");
			}
			System.out.println();
		}
		
	}
}
