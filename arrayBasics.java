

import java.util.Scanner;
public class arrayBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] roll_no = new int[10];

        int [] arr;  // Declaration of an array
        arr = new int[10];  //initialization

        String []  str = new String[12];
        System.out.println(str[2]); // it gives null value because the default value is null

        int [] Ar = new int[5];
        Ar[0] = 23;
        Ar[1] = 45;
        Ar[2] = 65;
        Ar[3] = 90;
        Ar[4] = 35;
//        System.out.println(Ar);   kuchh to garbar hai
        System.out.println(Ar[4]);

    }
}
