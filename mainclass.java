public class mainclass {
    public static void main(String [] args){
        Dog d1 = new Dog();
        d1.name = "Puppy";
        d1.age = 3;
        d1.color = "Brown";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walking();

    }
    
}

class Dog{
    String name;
    int age;
    String color;

    void bark(){
        System.out.println(name + " is barking");

    }

    void walking(){
        System.out.println(name + "  is walking");
    }
}

class cat{

}
