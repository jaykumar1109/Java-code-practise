import java.util.Scanner;
public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int dividend = sc.nextInt();
            System.out.print("Enter another number:");
            int divisor = sc.nextInt();
            try {
                int result = dividend / divisor;
                System.out.println("Result:" + result);
            } catch (ArithmeticException e) {
                System.out.println("error:Cannot divide by zero");
            }
            sc.close();
        }
    }
