import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number.");
        int n = sc.nextInt();
        if (n > 0){
            System.out.println("You entered a positive number and it is " + n);
        } else if (n < 0){
            System.out.println("You entered a negative number and it is " + n);
        }
    }
}