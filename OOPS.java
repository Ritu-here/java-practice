
public class OOPS{


    public void main(String[] args){
        Pen P1 = new Pen();
        P1.setColor(Integer.parseInt("Blue"));
        System.out.println(P1.getColor("Blue"));
        Pen p1 = null;
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor(Integer.parseInt("yellow"));
        System.out.println(p1.getColor("BLUE"));
        BankAccount myAcc = new BankAccount();
        myAcc.Username = "Ritu_Kumari";
        myAcc.setPdw("Ritu@123");

    }
    class Pen{
        private String color;
        private int tip;

        String getColor(String blue){
            return this.color;  // "this" keyword is used to refer to the current object
        }

        int getTip(){
            return this.tip;
        }

        void setColor(int newColor){
            color = String.valueOf(newColor);
        }

        void setTip(int newTip){
            tip = newTip;
        }
    }

    class BankAccount{
        public String username;
        public String Username;
        private String Password;

        public void setPdw( String pwd){
            String password = pwd;
        }
    }

    class Student{
        String name ;
        int age;
        float percentage;

        void calcuPecentage(int maths , int phy , int chem){
            float percantage = (maths + phy + chem)/3;


        }
    }
}
