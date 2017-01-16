package neha_practice;
/*
 * http://www.programcreek.com/2014/04/leetcode-remove-element-java/
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *  (Note: The order of elements can be changed. It doesn't matter what you leave beyond the new length.)
 */
public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A={2,4,6,5,4};
		int remove=4;
		int newLength=RemoveElementAndReturnNewLengthInplace(A, remove);
		System.out.println("The new length after removing is"+newLength);

	}

	
	public static int RemoveElementAndReturnNewLengthInplace(int[] A, int elem)
	{
		int i=0;
		int j=0;
		
		while(j<A.length)
		{ 
			 if(A[j]!=elem)
			 {
				 A[i]=A[j];
				 i++;
			 }
		  j++;	 
			
		}
		
		return i;
	}
}
