package neha_practice;

/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has properties:

1) Integers in each row are sorted from left to right. 2) The first integer of each row is greater than the last integer of the previous row.

For example, consider the following matrix:

Given target = 3, return true.

Solution: This is a typical problem of binary search. Find the element in the sorted array. 
*/

public class FindIn2DMatrix {
	
	public static void main(String[] args)
	{
		int[][] Matrix2D = { 
				             {1,3,5,7},
				             {10,11,16,20},
				             {23,30,34,50}
		};
		boolean result = FindNumber(Matrix2D, 167);
		System.out.println("In main");
		System.out.println("Answer is "+ result);
	}
	public static boolean FindNumber(int[][] matrix, int target)
	{
		
		//add null checks for matrix; 
		
		int m=matrix.length; //m is no of rows in matrix.
		int n=matrix[0].length; //n is no of columns in matrix. 
		
		int start=0;
		int end=(m*n)-1;
		
		
		
		//now binary search starts with the while loop below. 
		while(start<=end)
		{
			int mid=(start+end)/2;
			int midX=mid/n;
			int midY=mid%n;
			
			
			if(matrix[midX][midY] == target)
				return true;
			
			if(matrix[midX][midY] < target)
				start=mid+1;
			else
				end=mid-1; 
			
		}
		return false;
		
		
	}
	

}
