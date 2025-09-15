import java.util.Scanner;


public class RelationalOpEx {
    public static void main(String[] args) {
        System.out.println("Enter your age to check your eligiblity ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("Yes, you are eligible to this this");
        }
        else{
            System.out.println("No , your are child ");
        }
    }
}
