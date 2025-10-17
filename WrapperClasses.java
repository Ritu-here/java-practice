//Wrapper classes

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String [] args){
        Integer obj = new Integer(12);
        Integer obj2 = Integer.valueOf(12);

        System.out.println(obj2);

        Integer obj3 = 12; // Autoboxing
        int age = obj; //Unboxing

        System.out.println(age);

//        ArrayList<Integer> a = new ArrayList<>();
    }
}
