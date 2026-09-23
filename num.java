import java.util.Scanner;

public class Subtraction {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        // Input two integers
        System.out.println("Enter a = ");
        int a = scanner.nextInt();
        System.out.println("Enter b = ");
        int b = scanner.nextInt();
        
        // Subtraction of a and b
        int sub = a-b;
        
        // Print Sub
        System.out.println("Subtraction = "+sub);
    }
}