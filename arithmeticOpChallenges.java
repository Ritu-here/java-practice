import java.util.Scanner;

public class arithmeticOpChallenges {
    public static void main(String[] args) {
        System.out.println("Uses of all Arithmetic Operators");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = input.nextInt();
        System.out.println("Enter your second number");
        int b = input.nextInt();
        System.out.println("Here is the result of the all Arithmetic operation performed on the given input");
        System.out.println("Addition of a and b :" + (a + b) );
        System.out.println("Subtraction of a and b :" + (a-b));
        System.out.println("Multiplication of a and b:" + (a*b));
        System.out.println("Division of a and b:" + (a/b));
        System.out.println("Modulus of a and b:" + (a%b));
    }

}
