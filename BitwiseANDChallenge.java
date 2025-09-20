import java.util.Scanner;

public class BitwiseANDChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND Operator\n");
        System.out.println("PLease Enter your first number");
        int first = input.nextInt();
        System.out.println("Please Enter your Second number ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is: " + result);
    }
}
