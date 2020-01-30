
package pkg1a;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,n,m;
        n=input.nextInt();
        m=input.nextInt();
        a=input.nextInt();
        System.out.println((long)(Math.ceil(n/a)* Math.ceil(m/a)));
    }
    
}
