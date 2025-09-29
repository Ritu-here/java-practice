
import java.util.*;
public class FactorialMethod {

    public static int fact(int n){
        Scanner input = new Scanner(System.in);
        int f = 1;

        for(int i = 1 ; i <= n ; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fact(4));

    }
}
