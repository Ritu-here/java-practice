import java.util.Scanner;

public class BitwiseXORChallenge {
    public static void main(String[] args) {
        System.out.println("Showcasing XOR Operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int result = num1 ^ num2;
        System.out.println("The Result is: " + result);
    }
}
