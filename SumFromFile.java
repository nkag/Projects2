package neha_practice;
import java.io.*;

public class SumFromFile {
	
	
	  public static void sumFile ( String name ) {
	        try {
	            int total = 0;
	            BufferedReader in = new BufferedReader ( new FileReader (numbers.txt.rtf));
	            for ( String s = in.readLine(); s != null; s = in.readLine() ) {
	                total += Integer.parseInt ( s );
	            }
	            System.out.println ( total );
	            in.close();
	        }
	        catch ( Exception xc ) {
	            xc.printStackTrace();
	        }
	    }

}
