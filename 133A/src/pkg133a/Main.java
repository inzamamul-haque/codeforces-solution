
package pkg133a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        a=input.next();
        if(a.contains("H")|| a.contains("Q") || a.contains("9")){
            System.out.println("YES");
        
        }
        else{
            System.out.println("NO");
        }
        
        
    }
    
}
