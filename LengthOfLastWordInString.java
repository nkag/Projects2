package neha_practice;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int l=	lengthOfLastWord("blue is the sky  ");
	System.out.println(l);
		
	/*	String str="Blue is the sky  ";
		int length=str.length();
		for(int i=length-1; i>=0;i++)
		{
			if(str.charAt(i)==' ')
				System.out.println("0");
			else if(str.charAt(i)=='a')
				
		}
*/
	}

	static public int lengthOfLastWord(String s) { 
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
	        }
	        else{
	            if(flag)
	                return result;
	        }
	    }
	 
	    return result;
	}

	
}
