public class inheritanceProperty {

    public static void main(String [] args){
        sDeveloper d1 = new sDeveloper();
        d1.name = "Ritu kumari";
        d1.age = 22;

        d1.work();


    }
    
}

class jDeveloper extends sDeveloper{
    void basicWork(String byebye){
        System.out.println("My work is done here");
    }

}
class sDeveloper{
    String name;
    int age ;


    void work(){
        System.out.println("Working is going on");
    }
}