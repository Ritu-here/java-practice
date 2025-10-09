import java.util.Scanner;


public class addAllOddNumber {
    public static void main(String[] args) {
        System.out.println("Calculator which calculate all the odd number from 1 to your given number ");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.println("Enter Your Number");

        int num =input.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd sum till " + num + " is " + sum);

        }

        

        public static int oddSum(int num){
        int sum = 0;
        int i =1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
