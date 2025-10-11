// important points of oops concept


public class classMethods {
    public static void main(String [] args){

        // Object creation and constructor call
        person p1 = new person();
        p1.name = "Ritu kumari";
        p1.age = 55;
        

        person p2 = new person(8 , "sneha");


        p1.walk();
        p2.eat();
        p1.walk(10);
        System.out.println(person.count);
    }
    
}

class person{
    String name;
    int age ;
    
    // static keyword is use to define the properties of any class
    static int count;

    // constructor
    person(){
        count++;
        System.out.println("Creating an object--- This is a constructor");
    }
// Parametrize constructor
    person(int age , String name){
        this();   //this keyword is use to call other contructors of the same class
        this.name = name;  //this keyword is use to access the parameters 
        this.age = age;

    }

// methods
    void eat(){
        System.out.println(name + " is eating");
    }

    void walk(){
        System.out.println(name + " is walking");
    }
    void walk(int steps){
        System.out.println(name + "walked " + steps);
    }
}