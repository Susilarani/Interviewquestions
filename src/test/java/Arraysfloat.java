import java.util.Scanner;

/**
 * Created by Acer on 06/01/2017.
 */
public class Arraysfloat {
    public static void main(String args[]) {
        float i;
        float a[] = new float[5];
        Scanner s1 = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            a[(int) i] = s1.nextFloat();
            for (i = 0; i < 5; i++) {
                System.out.print(a[(int) i]);
            }
        }
    }
}