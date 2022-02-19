package OOPS_3.inheritance;

public class BoxPrice extends BoxWeight{
    public double side;
    double cost;
    BoxPrice(){
        super();
        this.cost=-1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    public BoxPrice(double l, double w, double h, double weight,double cost){
        super(l,w,h,weight);
        this.cost=cost;
    }

    public BoxPrice(double side,double weight,double cost){
            super(side,weight);
            this.side=side;
            this.cost=cost;
    }


}
