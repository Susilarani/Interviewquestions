/**
 * Created by Acer on 06/01/2017.
 */
public class Constructor {
    Constructor() {
        System.out.println("Sample");

    }
    Constructor(int a){
        System.out.println(a);
    }
public static void main(String args[]){
        new Constructor();
        new Constructor(4);
}


}
