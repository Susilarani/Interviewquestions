/**
 * Created by Acer on 06/01/2017.
 */
public class Breakpoint {
    public static void main(String args[]){
        int i;
        for (i=0;i<5;i++){
            if(i%2==0){
                break;
            }
            else {
                System.out.println("Odd");
            }
        }
    }
}
