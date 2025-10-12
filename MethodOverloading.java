//method overloading

public class MethodOverloading {

    public static void main(String [] args){
        Greet g1 = new Greet();
        g1.greeting("Ritu");
        g1.greeting(" Motu" , 2);

    }
    
}

class Greet{
    void greeting(){
        System.out.println("Hello , Good Morning");
    }

    void greeting(String name){
        System.out.println("Hello " + name + " , Good Morning");
    }
    void greeting(String name , int count){
        for(int i =0 ; i<count ; i++){
            System.out.println("Hello" + name + " , Good Morning");
        }
    }
}
