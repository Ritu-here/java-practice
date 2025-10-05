


public class hollowRectPattern {
    public static void hollow_rect(int totRow , int totCol){
//        outer loop (row)
        for(int i = 1 ; i <= totRow ; i++){
//            inner loop(column)
            for(int j =1 ; j <= totCol; j++){
                if( i == 1 || i == totRow || j == 1 || j == totCol ){
//                    for boundary cells
                    System.out.print(" * ");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        hollow_rect(4,5);

    }
}
