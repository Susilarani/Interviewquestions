/**
 * Created by Acer on 06/01/2017.
 */
interface Interface1 {
    abstract void add();
}
interface  Interface2 {
    abstract void sub();
}
interface  Interface3 extends Interface1,Interface2 {
    abstract void mul();
}

 class Interface4 implements Interface3 {
    int a=10;
    int b=20;
    int c=a+b;
    int d=a-b;
    int e=a*b;

    public void add() {
        System.out.println(c);

    }

    public void sub() {
        System.out.println(d);

    }

    public void mul() {
System.out.println(e);
    }


    public static void main(String args[]){
        Interface4 obj=new Interface4();
        obj.add();
        obj.sub();
        obj.mul();
    }
}