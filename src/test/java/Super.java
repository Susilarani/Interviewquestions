/**
 * Created by Acer on 06/01/2017.
 */
public class Super  {
    public void move() {
        System.out.println("My Bike is running");
    }
}
 class Super1 extends Super {
    public void move(){
        super.move();
        System.out.println("My Bike is Jumping");

    }
    public static void main(String args[]){
        Super1 obj=new Super1();
        obj.move();
    }
}