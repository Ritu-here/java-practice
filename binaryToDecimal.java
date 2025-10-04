

public class binaryToDecimal {

    public static void biToDec(int biNum){
        int myNum = biNum;
        int pow = 0;
        int decNum = 0;

        while(biNum > 0 ){
            int lastDigit = biNum % 10;
            decNum = decNum + (lastDigit *(int) Math.pow(2 , pow));

            pow++;
            biNum = biNum/10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum );
    }

    public static void main(String[] args) {
        biToDec(10);

    }
}
