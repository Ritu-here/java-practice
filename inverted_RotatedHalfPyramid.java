


public class inverted_RotatedHalfPyramid {

    public static void pattern(int n , int m){
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        pattern(4,5);

    }
}
