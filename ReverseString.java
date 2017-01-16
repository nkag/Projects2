package neha_practice;

public class ReverseString {

	public static void main(String[] args){
		
		String s="hello";
		String rev=reverse(s);
		System.out.println(rev);
	}
	
	public static String reverse ( String s ) {
    int length = s.length(), last = length - 1;
    char[] chars = s.toCharArray();
    for ( int i = 0; i < length/2; i++ ) {
        char c = chars[i];
        chars[i] = chars[last - i];
        chars[last - i] = c;
    }
    return new String(chars);
}
}