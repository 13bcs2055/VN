package js;
import java.util.Scanner;
public class even {
	
	
	
	    public static void main (String[] args) 
	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number you want to check:");
	        n = s.nextInt();
	        if(n == 0)
	        {
	            System.out.println("The given number "+n+" is even");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is odd");
	        }
	        
	    }
	}
