package neha_practice;

public class LengthOfLastWord {
	
	public static void main(String[] args){
		
		String s1= "Hello World";
		int result1= lengthOfLastWord(s1);
		System.out.println(result1);
	}  // heyy you ". this explains case for why we check again for flag to be true in the else part coz last character is space and 
	
	
	public static int lengthOfLastWord(String s) { 
	    if(s==null || s.length() == 0)
	        return 0;
	 
	    int result = 0;
	    int len = s.length();
	 
	    boolean flag = false;
	    for(int i=len-1; i>=0; i--){
	        char c = s.charAt(i);
	        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
	            flag = true;
	            result++;
	        }else{
	            if(flag)
	                return result;
	        }
	    }
	 
	    return result; // always have a return statement or something to output at the end of the loop so when it comes out of loop when condition is not met, 
	}

}
