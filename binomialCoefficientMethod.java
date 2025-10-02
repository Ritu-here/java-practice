
import java.util.Scanner;

public class binomialCoefficientMethod {

    public static int factorial(int f ){
        int fact = 1;
        for(int i =1 ; i <= f ; i++){
            fact = fact*i;
        }
        return fact;
    }


    public static int biCoefficient(int n , int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr = factorial(n-r);

        int biCoefficient = n_fact / (r_fact * nmr);
        return biCoefficient;
    }
    public static void main(String[] args) {
        System.out.println(biCoefficient(5,2));

    }
}
