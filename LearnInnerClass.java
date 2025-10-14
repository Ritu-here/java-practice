public class LearnInnerClass {
    class Toy{
        int price;
    }

    static class PlayStation{
        int price;
    }
    
    public static void main(String [] args){
        // Toy t1 = new Toy(); this is not possible because Toy is a non static class
        // t1.price 

        //if we want to use non static thing in static method then we have to create an obj of that class
        Toy t1 = new LearnInnerClass().new Toy();  //this is correct format
        //or

        LearnInnerClass obj = new LearnInnerClass();
        Toy t2 = obj.new Toy();

        PlayStation ps = new PlayStation();
        ps.price = 1000;
    }
}



//Using nested class makes your code more readable and provide better encapsulation
