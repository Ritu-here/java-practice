
import java.util.Scanner;
public class MultiplyFunction {



    public static int mul(int num1 , int num2){
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your first number");
//        int a = input.nextInt();
//        System.out.println("Enter your second number");
//        int b =input.nextInt();
        int mul = num1*num2;
//        System.out.println("The multiplication of the given numbers are " + mul);
        return mul;
    };
    public static void main(String[] args) {
        int a =3;
        int b =4;
        int res = mul(a,  b);
        System.out.println(res);

    }
}
