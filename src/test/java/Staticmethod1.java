/**
 * Created by Acer on 06/01/2017.
 */
public class Staticmethod1 {
    static int a=6;
    public static void add(){
        int b=a++;
        System.out.println(b);

    }
    public static void main(String args[]){
        add();
        add();
        add();
        add();
    }

}
