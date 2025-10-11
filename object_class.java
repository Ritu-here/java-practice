// Object and class 

public class object_class {
    public static void main(String [] args){
        person p1 = new person();
        p1.age = 21 ;
        p1.name = "Ritu kumari";
        p1.course = "B.tech";

        person p2 = new person();
        p2.name = "Rishu";
        p2.age = 22;
        p2.course = "BBA";

        System.out.println(p1.name +" "+ p1.age +" "+ p1.course);

    }
}
class person {
    String name ;
    int age;
    String course;

}