/*Q1. Sum of Digits – Easy 
Problem: Read an integer N and print the sum of its digits. Treat a negative number using its absolute 
value. 
Input: N 
Expected Output: Sum of digits 
Test Cases: 
Input: 4821 
Output: 15 
Input: -709 
Output: 16 */
import java.util.Scanner;
public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = scanner.nextInt();
        int sum = 0;
        N = Math.abs(N); 
        
        while (N > 0) {
            sum += N % 10;
            N /= 10; 
        }
        
        System.out.println("Sum of digits: " + sum); 
        scanner.close();
    }
}