// java package , Access modifiers , java encapsulation , data hiding , the static keyword

// Access modifiers are 
// Default , private , protected , public
public class Encapsulation {

    //static ke under se non static ko access nhi kr skte hai 
    //isliye non static keyword ka object banana hota hai 
    //static ko static ke andar use krne keliye object nhi banana hota hai
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void main(String [] args){
        Encapsulation.printHello();
        Encapsul2 e1 = new Encapsul2();
        e1.teachingClass = 10;
        // e1.id = 232223; this is not accessed because it a a private object
        e1.degree = "B.tech";
        e1.StudentCount = 100;
        
    }  
}

// Non-static variables cannot be used inside static methods.it will through a compile-time error

