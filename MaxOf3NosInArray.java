package neha_practice;
import java.lang.Math.*;

import java.util.Arrays;

public class MaxOf3NosInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,3,5,6,20};
		int n=5;
		int result=MaxOf3ElementsInArray(a,n);
       System.out.println("Max product is"+result);
	}

	
	public static int MaxOf3ElementsInArray(int[] arr, int n)
	{
		if(n<3)
			return -1;
		Arrays.sort(arr);
		return Math.max(arr[n-3]*arr[n-2]*arr[n-1], arr[0]*arr[1]*arr[n-1]);
		
	}
}
