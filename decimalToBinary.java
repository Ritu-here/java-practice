


public class decimalToBinary {
    public static void decToBin(int n ){
        int myNum = n;
        int pow = 0;
        int biNum = 0 ;

        while( n > 0){
            int rem = n % 2;
            biNum = biNum + (rem * (int)Math.pow(10 , pow));

            pow++;
            n=n/2;
        }
        System.out.println("Binary form of " + myNum + " = " + biNum);
    }

    public static void main(String[] args) {
        decToBin(5);

    }
}
