package ie.atu.week3;

import java.util.Scanner;

public class CalcOOP3 {
    public static void main(String[] args) {
   //methods
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Please enter an operator: ");
        String op = sc.next();
        switch (op) {
            case "subtract": subtract(a, b); break;
            default:
                System.out.println("Invalid operator");
                break;

        }
    }

    public static void subtract(int a, int b)
    {
     int sum = a - b;
        System.out.println("The sum is: " + sum);
    }

}
