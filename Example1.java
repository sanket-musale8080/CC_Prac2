class Multiplication{
    int num;

    void Display(){
        System.out.println("num ="+num);
        System.out.println("number after multiplied by 2= "+2*num);
    }
}
public class Example1{
    public static void main(String[] args) {
        Multiplication m=new Multiplication();
        m.num=100;
        m.Display();
    }
}
