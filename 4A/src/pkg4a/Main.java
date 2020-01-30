package pkg4a;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int a;
		a=input.nextInt();
		if(a%2==0 && a>2){
		  System.out.print("Yes");
		}
		else{
		    System.out.print("No");
		}
        
    }
    
}
