
package problem71;
import java.util.*;

class Problem71 {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	double a;
        int i;
        a= input.nextInt();
	String b;
	
	for(i=0;i<=a;i++)
	{
	    b=input.nextLine();
	    
	    if(b.length()>10)
	    {
	        System.out.print(b.charAt(0));
	        System.out.print(b.length()-2);
	        System.out.println(b.charAt(b.length()-1));
	    }
	    else{
	        
	        System.out.println(b);
	    }
	    
	}
	
	}
}