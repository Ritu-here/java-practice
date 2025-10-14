//Interface 

public class LearnInterface {

    public static void main(String [] args){
        dog d1 = new dog();
        d1.eats();
        d1.drinks();
        d1.sings();
        // Animal.Legs = 8 ;this is not possible because by default it is a public static final
        System.out.println(Animal.Legs);
    }

}
interface Animal{
    //any variable is public static final by default in the interface class..
    //if we remove the public static final still it is the same as before
    public static final int Legs = 4;
    void eats();
    void drinks();
    //we can make default method inside the interface
    default void walk(){
        System.out.println("This animal is walking");
    }
}

interface pet{
    void sings();
    void drinks();
}
    

// interface allow to implement more then one interface to a class
class dog implements Animal , pet{
    @Override
    public void eats(){ 
        System.out.println("Dog is eating");   
    }

    @Override
    public void sings(){
        System.out.println("Dog is singing");
    }

    @Override
    public void drinks(){
        System.out.println("Dog is drinking");
    }
}
