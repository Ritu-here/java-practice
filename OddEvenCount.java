public class OddEvenCount {
    public static void main(String [] args){
        // int oddCount = 0;
        // int evenCount = 0;
        // for(int i = 0 ; i <= A.length-1 ; i++){
        //     if(A[i] % 2 == 0){
        //         evenCount = evenCount + 1;
        //     }
        //     else{
        //         oddCount = oddCount+1;
        //     }
        // }
        // System.out.println( oddCount +" "+ evenCount);
    int [] arr = {22 ,45, 66, 28 , 43 , 89 , 88, 13 , 77,99,87,77};
        OddEvenCountFunction( arr);
    }


    public static void OddEvenCountFunction(int A[]){

        int oddCount = 0;
        int evenCount = 0;

        for(int i = 0 ; i <= A.length-1 ; i++){
            if(A[i] % 2 == 0){
                evenCount = evenCount + 1;
            }
            else{
                oddCount = oddCount+1;
            }
        }
        System.out.println( oddCount +" "+ evenCount);


    }
    
}
