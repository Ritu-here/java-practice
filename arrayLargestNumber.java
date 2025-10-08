
public class arrayLargestNumber {

    public static int getLargest(int [] numbers){
        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MIN_VALUE;

        for(int i = 0 ; i <= numbers.length-1 ; i++){
            if(numbers[i] > Largest){

                Largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest value is : " + smallest);
        return Largest;
    }
    public static void main(String[] args) {
        int [] numbers = { 55,64,32,43,21,65,443,980 ,98};
        System.out.println("The Largest value is " + getLargest(numbers));


    }
}
