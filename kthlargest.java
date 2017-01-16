package neha_practice;
import java.util.*;

public class kthlargest {


	     public static void main(String []args){
	        System.out.println("Hello World");
	        //find the kth largest element in array. 
	        int a[]={2,4,6,1,8,0}; //after sorting= 0,1,2,4,6,8. 
	        int k=3;
	        Arrays.sort(a);
	        System.out.println(a[a.length-k]); //sorting, so time is 0(nlog(n))
	     }
	}

