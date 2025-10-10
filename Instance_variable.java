public class Instance_variable {


    public static class car {
        int noOfWheels;//instance variable
        String color;
        float maxSpeed;
        int noOfSeats;
        float currrentFuelInLiters;


        public car start(){
            if (currrentFuelInLiters == 0) {
                System.out.println("Car is out of fuel");
            } else if (currrentFuelInLiters < 5) {
                System.out.println("Car is in reverse mode , please refuel");
            } else {
                System.out.println("Car is starting...");

            }
            return this;
        }

// instance methods
        public void drive() {
            currrentFuelInLiters--;
            System.out.println("Car is starting");
        }
            public void addFuel ( float fuel){
                this.currrentFuelInLiters += fuel;
            }


        public float getCurrrentFuelLevel(){
            return currrentFuelInLiters;
        }
    }
    public static void main(String[] args) {

    }
}
