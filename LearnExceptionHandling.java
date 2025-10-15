public class LearnExceptionHandling {
    public static void main(String [] args){
        int []a = new int[5];
        System.out.println("Hello guys");

        try{
            int result = 5/0;
            System.out.println(a[9]);


        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Tried to access the out of bound element");
//        }
//        catch(ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }
//or
//        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("Handling Exception");
//
//        }

        //All exceptions handled
        catch(Exception e){
            System.out.println("All exceptions are handling here");
        }
        System.out.println("Bye guysss");
    }
}
