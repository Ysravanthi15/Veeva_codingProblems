/*Q2. Prime Numbers in a Range – Moderate 
Problem: Print all prime numbers between L and R, inclusive, in ascending order. If no prime exists, 
print None. Constraints: 1 ≤ L ≤ R ≤ 100000. 
Input: L R 
Expected Output: Primes separated by one space, or None 
Test Cases: 
Input: 10 20 
Output: 11 13 17 19 
Input: 24 28 
Output: None */
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range (L R): ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        boolean foundPrime = false;
        for (int num = L; num <= R; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                foundPrime = true;
            }
        }
        
        if (!foundPrime) {
            System.out.println("None");
        }
    }
    
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}