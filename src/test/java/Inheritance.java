/**
 * Created by Acer on 06/01/2017.
 */
interface Inheritance {
    abstract void sub();
    }
     class Inheritance1 implements Inheritance {

         public void sub() {
             int a = 12;
             int b = 9;
             int c = a - b;
             System.out.println(c);
         }

         public static void main(String args[]) {
             Inheritance1 obj = new Inheritance1();
             obj.sub();
         }
     }

