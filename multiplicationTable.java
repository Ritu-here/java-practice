import java.util.Scanner;


public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter number it will print the multiplication table for you");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("The multiplication table of " + num + " is here.." );
        int n = 1;
        while(n <= 10){
            System.out.println(num +" * " + n + " = " + (num*n));
            n++;

        }


    }
}
