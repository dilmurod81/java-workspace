import java.util.Scanner;

public class Calculator {
    /**
     * I want to make a calculator app
     * for the start, I want to be able to multiply and divide numbers
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        double n1 = sc.nextDouble();
        System.out.println("Input second number");
        double n2 = sc.nextDouble();
        System.out.println("Input 'multiply' or 'divide'");
        String action = sc.nextLine();
        if (action.equals("multiply")){
            double result = multiply(n1, n2);
            System.out.println("Result is " + result);
        }else if (action.equals("divide")){
            double result = divide(n1, n2);
            System.out.println("Result is " + result);
        }
        
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }
}