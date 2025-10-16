public class GenericsMethod {
    public static void main(String [] args){
        printData("Hello honey Bunny");
        printData(123);
        printData("Something Something");
        GenericsMethod obj = new GenericsMethod();
//        obj.doubleData("Hiihihihihihihihihi");this gives error because its class is extended by number
        obj.doubleData(1234567);
        obj.doubleData(1.99f);

//        customeww c = new customeww();
//        obj.doubleData(c);

    }

    //Generics Method
    static <E> void printData(E data){
        System.out.println(data);
    }

    <E extends Number> void doubleData(E data){
        System.out.println(data);
    }
}

class customeww {

}



