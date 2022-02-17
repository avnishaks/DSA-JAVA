package Oops2.staticExample;


// this is a demo to show initialisation of static variables
public class staticBlock {
    static int a=10;
    static  int b;


    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("A.K ❤ T.S");
        b=a*10+4;
    }

    public static void main(String[] args) {
        staticBlock s1=new staticBlock();
        System.out.println(staticBlock.a+"   "+staticBlock.b+"   "+s1.a+"    "+s1.b);

        s1.b=s1.b+90;
        staticBlock s2=new staticBlock();
        System.out.println(s2.a+"   "+s2.b);
    }
}
