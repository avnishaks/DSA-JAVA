package OOPS_3.inheritance;

public class Box {
    double l;
    double w;
    double h;
    double weight=10;
    double count=900;
    public Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.l= old.l;
        this.w= old.w;
        this.h=old.h;
    }
    public Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    public void info(){
        System.out.println("Avnish Kumar is here !");
    }
}
