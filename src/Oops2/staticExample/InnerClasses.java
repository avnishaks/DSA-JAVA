package Oops2.staticExample;
// Outside class work , itself responsibloe for the object reference
class Demo{
    String name;

    public Demo(String name) {
        this.name = name;
    }
}
public class InnerClasses {
    // Static class need to be in the inner , as its not dependent from the outer , as for the object reference
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a=new Test("Avnish");
        Test b=new Test("Tanvi");
        Demo d=new Demo("Love");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(d.name);
    }
}
