package neha_practice;

public class Searchin2DMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] A={
		  {1,   4,  7, 11, 15},
		  {2,   5,  8, 12, 19},
		  {3,   6,  9, 16, 22},
		  {10, 13, 14, 17, 24},
		  {18, 21, 23, 26, 30}
		};
		System.out.println(searchMatrix(A, 7));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
	    int m=matrix.length-1;
	    int n=matrix[0].length-1;
	 
	    int i=m; 
	    int j=0;
	 
	    while(i>=0 && j<=n){
	        if(target < matrix[i][j]){
	            i--;
	        }else if(target > matrix[i][j]){
	            j++;
	        }else{
	            return true;
	        }
	    }
	 
	    return false;
	}

}
