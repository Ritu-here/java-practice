public class Encapsulation2 {
    public static void main(String[] args){
        person p1 = new person();
        p1.setAge(12);

        System.out.println(p1.getAge());
        

    }  
}

class person{
    private int age ;
    @SuppressWarnings("unused")
    private String name;
    boolean canBeChange = true;

    public void setAge(int age){
        if(canBeChange){
            if(age > 0){
        this.age = age;
            }
        }
    }

    public int getAge(){
        return age;
    }
}
