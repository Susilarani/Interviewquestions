import java.util.Scanner;

/**
 * Created by Acer on 06/01/2017.
 */
public class Arrays {
    public static void main(String args[]){
        int i;
        int a[]=new int[5];
        Scanner s1=new Scanner(System.in);
        for (i=0;i<5;i++){
            a[i]=s1.nextInt();
            for(i=0;i<5;i++){
                System.out.print(a[i]);
            }
        }
    }
}
