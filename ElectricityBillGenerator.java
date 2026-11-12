/*Q3. Electricity Bill Calculator – Easy 
Problem: Calculate a domestic electricity bill using slabs: first 100 units at ₹1.5/unit, next 100 at 
₹2.5/unit, and units above 200 at ₹4/unit. Add a fixed charge of ₹50. Units are non-negative; print the 
bill with two decimal places. 
Input: Units consumed 
Expected Output: Total bill 
Test Cases: 
Input: 80 
Veeva Systems Java Practice | Page 1 
Output: 170.00 
Input: 250 
Output: 650.00*/
import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        double bill = 50;

        if (units <= 100) {
            bill += units * 1.5;
        } else if (units <= 200) {
            bill += 100 * 1.5;
            bill += (units - 100) * 2.5;
        } else {
            bill += 100 * 1.5;
            bill += 100 * 2.5;
            bill += (units - 200) * 4;
        }

        System.out.printf("%.2f", bill);
    }
}