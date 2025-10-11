public class constructor{
    public static void main(String [] args){
        student s1 = new student("Ritu");
        System.out.println(s1.name);

        student s2 = new student("Ritu kumari");
        student s3 = new student(34456574);
        student s4 = new student();

    }
}

class student{
    // System.out.println("Constructor is called")
    String name;
    int roll;
    student(int roll){
        this.roll = roll;
    }

    student(String name){
        this.name = name;
    }

    student(){
        System.out.println("Constructor is called");
    }
}



// types of constructor 
// 1) parameterized constructor
// 2) Non parameterized constructor
// 3) copy constructor