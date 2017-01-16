package neha_practice;


public class ArrayCopy{

    public static void main(String []args){
       System.out.println("Hello World");
       int a[]={1,2,3,4,5,6,7};
       int k=3;
       rotate(a,k);
   }
    
    public static void rotate(int[] nums, int k) {
   if(k > nums.length) 
       k=k%nums.length;

   int[] result = new int[nums.length];

   for(int i=0; i < k; i++){
       result[i] = nums[nums.length-k+i];
   }

   int j=0;
   for(int i=k; i<nums.length; i++){
       result[i] = nums[j];
       j++;
   }

   System.arraycopy( result, 0, nums, 0, nums.length );//
   System.out.println(nums[0]);
   System.out.println(result[0]+ "&"+ result[1]+"&"+ result[3]);
}
}