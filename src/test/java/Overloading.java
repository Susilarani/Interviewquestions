/**
 * Created by Acer on 06/01/2017.
 */
public class Overloading {
    static int a=4;
    static  double d=2.4;

    public void add(int a){
        System.out.println(a);
    }
    public void add(double d){
        System.out.println(d);
    }
    public static void main(String args[]){
        Overloading obj=new Overloading();
        obj.add(4);
        obj.add(2.4);
    }
}
