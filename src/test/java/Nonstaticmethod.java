/**
 * Created by Acer on 06/01/2017.
 */
public class Nonstaticmethod {
  static   int a=5;
    public void add(){

        System.out.println(a++);
    }
    public static void main(String args[]){
        Nonstaticmethod m=new Nonstaticmethod();
            m.add();
            m.add();
            m.add();

        }
    }

