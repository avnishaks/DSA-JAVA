package OOPS_3.inheritance;

public class BoxWeight extends Box {
    double weight=34;
    public BoxWeight() {
        this.weight=-1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight= other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // Calling the Parent Class Constructor.
        // super access the weight of the parent classs
        System.out.println(super.weight);
        // this check if the weight present in the same class then it return that otherwise it return others.
        System.out.println(this.weight);
        System.out.println(this.count);
        this.weight = weight;
    }

    public BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
