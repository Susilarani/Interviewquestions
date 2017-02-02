

 public class Overriding {
     public void move() {
         System.out.println("It is moving");

     }
 }
    class Overriding1 extends Overriding{
        public void move(){
            System.out.println("It is slowly moving");

        }
        public static void main(String args[]){
            Overriding1 obj=new Overriding1();
            obj.move();


        }
    }


