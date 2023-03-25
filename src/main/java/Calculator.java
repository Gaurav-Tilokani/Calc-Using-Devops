import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {
        System.out.println("hii");
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Scientific Calculator. Press Enter to start..");
        sc.nextLine();

        do {
            System.out.println("Choose operation you want to perform");
            System.out.println("1 -----> Factorial\n" +
                    "2 -----> Power\n" +
                    "3 -----> Square root\n" +
                    "4 -----> Natural logarithm\n" +
                    "Enter any other number to exit");

            int op = sc.nextInt();
            double x = 0.0;
            switch (op) {
                case 1:
                    System.out.println("Enter the number you want to find factorial of:");
                    x = sc.nextDouble();
                    if(x < 0 || x > 20) {
                        System.out.println("Cannot find factorial of negative number and numbers greater 20!!");
                        break;
                    }
                    System.out.println("Factorial of " + x + " is " + calculator.factorial(x));
                    break;

                case 2:
                    System.out.println("Enter two numbers you want to find power of:");
                    x = sc.nextDouble();
                    double y = sc.nextDouble();
                    if(x < 0) {
                        System.out.println("Cannot find power of negative number!!");
                        break;
                    }
                    System.out.println(x + " to the power " + y + " is " + calculator.power(x, y));
                    break;

                case 3:
                    System.out.println("Enter the number you want to find square root of:");
                    x = sc.nextDouble();
                    if(x < 0) {
                        System.out.println("Cannot find square root of negative number!!");
                        break;
                    }
                    System.out.println("Square root of " + x + " is " + calculator.sqrt(x));
                    break;

                case 4:
                    System.out.println("Enter the number you want to find natural log of:");
                    x = sc.nextDouble();
                    if(x <= 0) {
                        System.out.println("Cannot find natural log of 0 or negative number!!");
                        break;
                    }
                    System.out.println("Natural log of "+ x + " is " + calculator.naturalLog(x));
                    break;

                default:
                    System.out.println("Exiting...");
                    return;
            }

        } while(true);
    }

    public Double naturalLog(Double a) {
        double result = Math.log(a);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

    public Double factorial(Double a) {
        if(a == 0) return 1.0;
        double result = 1;
        for(int i = 2; i <= a; i++) result *= i;
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public Double power(Double a, Double b) {
        double result = Math.pow(a, b);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public Double sqrt(Double a) {
        double result = Math.sqrt(a);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }
}
