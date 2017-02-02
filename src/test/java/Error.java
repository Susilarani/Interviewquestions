/**
 * Created by Acer on 08/01/2017.
 */
public class Error {
    static int a = 10;

    public void add() {
        try {
            int a[] = new int[2];
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public static void main(String args[]) {
        try {
            int a = 10 % 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
        Error obj = new Error();
        obj.add();


    }
}