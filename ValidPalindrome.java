package neha_practice;

public class ValidPalindrome {
	

	
	
		public static boolean isValidPalindrome(String s){
			if(s==null||s.length()==0) return false;
	 
			s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // this is a java regular expression to remove all alphanumeric characters except spaces. 
			System.out.println(s);
	 
			for(int i = 0; i < s.length() ; i++){
				if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
					return false;
				}
			}
	 
			return true;
		}
	 
		public static void main(String[] args) {
			String str = "A man, a??? plan, (a cannal: Panam_+*&^%$^&*(&%&(a";
	 
			System.out.println(isValidPalindrome(str));
		}
	}


