
package cmp202;
import java.util.Scanner;
/**
 *
 * @author Owakunle G. Samuel
 */
public class Assignment2 {
    
    public static void main (String[] agrs) {
        int flag=0,m;
        Scanner scan = new Scanner (System.in);
        System.out.println("input the value:  ");
        int n = scan.nextInt();
        m=n/2;
        for(int i=2;i<=m;i++){
            if(n%i==0){
            System.out.println(n+ " is not a prime number");
            flag=1;
            break;
            
            }
           
            }
        if(flag==0){
        System.out.println(n+ "is a prime number");
        }
       
      
    }
    
}
