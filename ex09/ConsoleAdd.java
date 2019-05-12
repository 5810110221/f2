import java.util.Scanner;
public class ConsoleAdd{  
    public static void main(String[] args){ 
        Scanner s = new Scanner( System.in );    
        System.out.print("Enter first integer: ");   
        int x = s.nextInt();    
        System.out.print("Enter second integer: ");
        int y = s.nextInt();    
        s.close();    
        System.out.println("Adding gives: " + (x+y) );  
    }
}