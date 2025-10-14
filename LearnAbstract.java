public class LearnAbstract {
    public static void main(String [] args){
        // vehical v1 = new vehical();when class is abstract we can't create it's object
        //we can create the object of the car class because car is not a abstract class
        car c1 = new car();
        c1.accelerate();
        c1.breaks(4);
        c1.accelerate();
        c1.honks();

    }
    
}
//we can't implement abstract method in a normal class
abstract class vehical{
    //abstract class have both regular method and abstract method
    abstract void accelerate();//this is a abstract method and it can't have body

    abstract int breaks( int wheels);

    void honks(){
        System.out.println("Vehicals honks");
    }


}

class car extends vehical{
    //here we have to implement all abstract method of the vehical or we have to make 
    //car class as abstract class

    @Override //annotation
    void accelerate(){
        System.out.println("Car is accelerating");

    }

    @Override
    int breaks(int wheels){
        System.out.println("car breaks are pushed");
        return wheels;

    }
}

class vernaCar extends vehical{

    @Override
    void accelerate(){
        System.out.println("Verna car is accelerating");
    }

    @Override
    int breaks(int wheels){
        System.out.println("Verna car is pussed break");
        return wheels;
    }

}