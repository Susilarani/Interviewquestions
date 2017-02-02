/**
 * Created by Acer on 23/01/2017.
 */
public class Leapyear {

    static int i=1993;
    public static void main(String args[]) {
        if(i%4==0&&i%100!=0&&i%400==0)
            System.out.println("This is a leap year");
            else{
                System.out.println("This is not a leap year");
            }


        }

    }