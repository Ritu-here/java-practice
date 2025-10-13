public class Encapsul2 {

    public int teachingClass;
    // private int id;

    String degree;
    protected int StudentCount;

    public static void main(String [] args){

        Encapsulation.printHello();
        Encapsul2 en = new Encapsul2();
        // en.id = 123;
        en.teachingClass = 12;

    }
    
}
//NOTE:---
// public is available for all 
// private is only accessed within the same class
// procted is accessed by any sub-class no matter package is same or different 
// Default is accessed only in the same package
