
import java.util.Arrays;
import java.util.Scanner;

public class arrInputForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr  = new int[5];

        //For Input
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        // For Output
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i] + "");
//        }
        for (int j : arr) System.out.print(j + " ");  //Advanced version




//        Strings
        String [] str = new String[4];
        for(int i = 0 ; i < str.length ; i++){
            str [i] = in.next();
        }
        System.out.println(Arrays.toString(str));  //[aa dd ee rr ]

    }
}
