
package pkg112a;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a,b;
        int c;
        a=input.nextLine();
        a=a.toLowerCase();
        b=input.nextLine();
        b=b.toLowerCase();
        c=a.compareTo(b);
        
        if(c<0) {
            System.out.println("-1");
        }
        else if(c>0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    
}
