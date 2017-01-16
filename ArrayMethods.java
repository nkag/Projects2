package neha_practice;
import java.io.*;
import java.util.Arrays;
public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   // initializing boolean array
		   boolean[] bval = new boolean[] { true };

		   // hashcode for value1
		   int retval = bval.hashCode();
		   
		   // printing hash code value
		   System.out.println("The hash code of value1 is: " + retval);
		   
		   // value2 for boolean array
		   bval=new boolean[] { false };
		    
		   // hashcode for value2
		   retval=bval.hashCode();

		   // printing hash code value
		   System.out.println("The hash code of value2 is: " + retval);    
		
		
	}

}
