public class LearnConstructor {
    public static void main(String [] args){
        complex num1 = new complex();
        complex num2 = new complex(3,8);
        num1.print();
        num2.print();

    }
    
}

class complex{
    int a , b;
//overriding the default constructor
    public complex(){
        a = 5;
        b = 9;
        System.out.println("Creating a new object");
    }
//constructor can be overloaded but can't be overridden 
    public complex(int real , int imaginary){
        a = real;
        b = imaginary;
    }
     void print(){
        System.out.println(a + " + " + b+"i");
     }
}