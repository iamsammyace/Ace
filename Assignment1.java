
package cmp202;
import java.util.Scanner;
/**
 *
 * @author Owakunnle G. Samuel
 * bhu/15/04/05/0028.
 * cmp202
 */
public class Assignment1 {
   
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value ");
        int x = input.nextInt();
        
    if(x%2== 0){
        System.out.println(x+ "is an even number");
    }
    else{
        System.out.println(x+ "is an odd number");
    }
                
        
    }
    
}
