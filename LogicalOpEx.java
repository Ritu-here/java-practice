import java.util.Scanner;
public class LogicalOpEx {
    public static void main(String[] args) {
        System.out.println("Welcome to ticket discount calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("PLease Enter your age");
        int age = input.nextInt();
        System.out.println("Are you a female? (True/False)");
        boolean isFemale = input.nextBoolean();


        if(age < 5){
            System.out.println("You got 75% discount");
        }
        else if(isFemale){
            System.out.println("You got 50% discount");
        }
        else if(age > 60 && !isFemale){
            System.out.println("You got 25% discount");
        }
        else{
            System.out.println("You got no discount");
        }
    }
}
