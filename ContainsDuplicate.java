package neha_practice;
import java.util.*;

public class ContainsDuplicate {
	
	public static void main(String[] args){
		int[] a = {5,119,7,2,191,77,6,88,11};
		System.out.println(containsDuplicate(a));
		}

	public static boolean containsDuplicate(int[] nums) {
	    if(nums==null || nums.length==0)
	        return false;
	 
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i: nums){
	        if(set.add(i)!=true){ //set doesn't allow u to add duplicates. so when u try to add duplicates, if stmt becomes false and it goes
	        	                  //inside if block and returns true. 
	            return true;
	        }
	    }
	 
	    return false;
	}
	
	
}
