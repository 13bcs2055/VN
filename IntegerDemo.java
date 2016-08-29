import java.lang.*;

public class IntegerDemo {

   public static void main(String[] args) {

   int i = 170;
   System.out.println("Number = " + i);
    
   /* returns the string representation of the unsigned integer value 
   represented by the argument in binary (base 2) */
   System.out.println("Binary = " + Integer.toBinaryString(i));

   // returns the number of one-bits 
   System.out.println("Number of one bits = " + Integer.bitCount(i)); 
  
   /*  returns the value obtained by reversing order of the bits in 
   the specified int value */ 
   System.out.println("After reversing = " + Integer.reverse(i));
   }
} 
