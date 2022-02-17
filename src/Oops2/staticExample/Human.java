package Oops2.staticExample;

public class Human {
    int age;
    int slaray;
    boolean married;
    String name;
    static long population;
    public Human(int age, int slaray, boolean married, String name) {
        this.age = age;
        this.slaray = slaray;
        this.married = married;
        this.name = name;
        Human.population+=1;
    }

    public static void main(String[] args) {

    }
}
