/**
 * Created by Acer on 06/01/2017.
 */
abstract class Abstract {

    abstract void add();

    public void sub() {
        int a = 3;
        int b = 5;
        int d = a - b;

        System.out.println(d);

    }
}

     class Mydata extends Abstract {

         void add() {
             int a = 3;
             int b = 5;
             int c = a + b;

             System.out.println(c);
        }

        public static void main(String args[]){
            Mydata obj=new Mydata();
            obj.add();
            obj.sub();

            }

        }


