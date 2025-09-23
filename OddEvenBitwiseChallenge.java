import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvenBitwiseChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ODD/EVEN Calculator");
        System.out.println("PLease enter your number");
        int num = input.nextInt();


        if((num & 1 ) == 1){
            System.out.println("Your number is odd");
        }
        else{
            System.out.println("Your number is even");
        }

    }
}
