/**
 * Created by Acer on 06/01/2017.
 */
public class Switchcondition {
    public static void main(String args[]){
        char name='c';
        switch(name){
            case 'A':{
                System.out.println("Verygood");
                break;
            }
            case  'B':{
                System.out.println("Good");
                break;
            }
            case 'c':{
                System.out.println("Veryverygood");
                break;
            }
default:{
    System.out.println("Wrongchoice");
}
        }

    }
}
