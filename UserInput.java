import java.util.Scanner;

public class userInput {
    public static void main(String []  args){
        Scanner input = new Scanner(System.in);
        System.out.println("PLease inter your name:");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.println("PLease enter your age");

        int age = input.nextInt();
        System.out.println("Your age is " + age);

    }
}
