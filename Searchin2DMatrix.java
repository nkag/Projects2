package neha_practice;

public class Searchin2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A={{1,  3,  5,  7}, 
				   {10, 11, 16, 20},
				   {23, 30, 34, 50}
				   };
		int target = 3;
		boolean result=BinarySearchin2DMatrix(A, target);
		System.out.println(result);

	}
	
	public static boolean BinarySearchin2DMatrix(int[][] arr, int searchvalue){
		
		int m=arr.length; //no of rows
		int n=arr[0].length;//no of columns
		int start=0;
		int end=(m*n)-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			int midX=mid/n;
			int midY=mid%n;
			
			if(arr[midX][midY]==searchvalue)
				return true;
			else if(arr[midX][midY]<searchvalue)
			    start=mid+1;
			else
				end=mid-1;
		}
		return false;
		
	}

}
