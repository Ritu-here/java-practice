public class FinallyBlockInException {
    public static void main(String [] args){
        int []a = new int[5];

        System.out.println("Hello World");

//        try{
//            System.out.println(a[8]);
//        }
//        catch(Exception e){
//            System.out.println("Exception handled");
//
//        }
//        finally{
//            System.out.println("I will run always");
//        }
//
//        System.out.println("Endddd");

        try{
           getNumberFromArray(a);
        }
        catch(Exception e){
            System.out.println("Catch the exception" + e.getMessage() );
        }
    }

    static int getNumberFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }
}

//Finally block will always execute and only execute one time
//catch block defined by any number of time

//note :----- There are some cases when a finaaly block does not execute:
// Use of System.exit() method
//An execution occurs in the finally block
// The death of a thread
