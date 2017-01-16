package neha_practice;
import java.util.*;


//Given an array of integers and an integer k, return true if and only if there are two distinct indices i and j in the array 
		//such that nums[i] = nums[j] and the difference between i and j is at most k.

public class ContainsDuplicateII {
	
	public static void main(String[] args){
		 
		int[] nums={11,24,87,124,99,7};
		int k=7; 
		System.out.println(Duplicates(nums, k));
	}
	
	public static boolean Duplicates(int[] a, int k){
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		int difference=Integer.MAX_VALUE; //here, u r assigning a value to diff coz later u dont want not initialized error for difference variable
		for(int i=0; i<a.length; i++){      //inside if block. 
			if(hm.containsKey(a[i]))
			{
				int first_occurence=hm.get(a[i]); 
				difference= i-first_occurence;
			}
			
			hm.put(a[i], i);
		  }
		
		if(difference <= k)
			return true;
		else
		return false;
	}
}