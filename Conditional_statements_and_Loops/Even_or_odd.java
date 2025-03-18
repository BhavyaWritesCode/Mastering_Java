package Conditional_statements_and_Loops;
import java.util.Scanner;

public class Even_or_odd {

    public static void main(String[] args){
        
        int a;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Positive or Negative or Zero : ");
        a = obj.nextInt();
                
        if(a > 0){
            System.out.println("The number is Positive");
        }
        else if(a < 0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("The number is Zero");
        }
        obj.close();

    }
    
}
