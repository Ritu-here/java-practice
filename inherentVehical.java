public class inherentVehical {
    final int gears = 4;   //variable with final keyword cannot be assigned again 

    public static void main(String [] args){
        inherentVehical v1 =  new inherentVehical(4);
    }

    int wheelsCount;
    String model;

// constructor 
    inherentVehical(){
        System.out.println("Creating a vehical instance");

    }

    inherentVehical(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicals with wheels");

    }


void start(){
    System.out.println("Vehical is starting");
}

//accelerate method can't be override by any child class because it is define with final keyword
final void accelerate(){
    System.out.println("Vehical is accelerating");
}

    
}
