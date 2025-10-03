import java.util.Scanner;

public class FunctionIntro {
    public static void main(String[] args) {
        System.out.println("In main method");
        greeting();
        System.out.println("Method calling completed");
        printFirstPattern();
        printSecondPatter();
        printThirdPatter();
    }

    public static void greeting(){
        System.out.println("Good Morning Everybody");
    }

    public static void printFirstPattern(){
        System.out.println("    *\n   **\n  ***\n ****\n*****");


    }

    public static void printSecondPatter(){

        System.out.println(" * * * * *\n  * * * * \n * * *\n * *\n * ");



    }
    public static void printThirdPatter(){
        System.out.println(" * \n * * \n * * * \n * * * *\n * * * * *");



    }
}
