package neha_practice;
//http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-java/

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2,4,4,6,6,6,7,7,8}; //new array=2,4,4,6,6,7,7,8 
int newLength=RemoveDuplicateFromSortedArrayAndReturnNewLength(A);
System.out.println(newLength);
	}

	
	public static int RemoveDuplicateFromSortedArrayAndReturnNewLength(int[] A)
	{
		/*int i=0;
		 * 
		 
		int j=0;
		
		while(j<A.length-1)
		{
			//int k=j++;
			if(A[j]!=A[j+1])
			{
				A[i]=A[j];
				i++;
			}
			j++;
		}
		return i;
		*/
		int count=0;
		for(int i=0; i<A.length-1; i++)
		{
			if(A[i]==A[i+1])
			{
				count++;
			} 
		}
		
		return A.length-count;
	}
}
