public class LearnGenerics {

    public static void main(String [] args){
        Dogeshh<String , String> d1 = new Dogeshh<>("1234" , "Leo");
        Dogeshh<String , Integer> d2 = new Dogeshh<>("ru22" , 123);

        Dogeshh<Integer , String> d3 = new Dogeshh<>(10 , "lee");
        System.out.println(d3.getId());

    }
}

//Generic class
class Dogeshh<E , V >{
    E id;
    V name ;
    public Dogeshh(E id, V name ){
        this.id = id;
    }

    E getId(){
        return id;
    }

}
