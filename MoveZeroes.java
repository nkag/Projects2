package neha_practice;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={0,1,0,12,14};
		MovingZeroesToEndOfArray(numbers);

	}

	public static void MovingZeroesToEndOfArray(int[] nums)
	{
		int i=0;
		int j=0;
		
		while(j<nums.length)
		{
			if(nums[j]==0)
			{
				j++;
			}
			
			else{
			 nums[i]=nums[j];
			 i++;
			 j++;
			}
			
		}//end of while loop.
		
		while(i<nums.length)
		{
			nums[i]=0;
			i++;
		}  //end of second while loop for adding zeroes to the end of the array. 
	}
	
	
}
