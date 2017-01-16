package neha_practice;
/*
 * Climbing steps DP http://www.programcreek.com/2012/11/top-10-algorithms-for-coding-interview/
 * 
 * https://www.youtube.com/watch?v=CFQk7OQO_xM tushar roy video
 */

public class ClimbingStepsDynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NoOfSteps=4;
		int result= NoOfWaysToReachStepUsingDP(NoOfSteps);
		System.out.println("The number of ways to reach is"+ result);

	}
	
	public static int NoOfWaysToReachStepUsingDP(int n)
	{
		//because it is DP, u have to store the results somewhere.
		int[] A=new int[100];
		
		if(n<=2)
			A[n]=n;
		
		if(A[n]>0)
		return n;
		
		else
			A[n]=NoOfWaysToReachStepUsingDP(n-1) + NoOfWaysToReachStepUsingDP(n-2);
		
		return A[n];
	}

}
