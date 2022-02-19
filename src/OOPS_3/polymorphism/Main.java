package OOPS_3.polymorphism;

public class Main {
    public static void main(String[] args) {
         Shape shape=new Shape();
         Circle circle=new Circle();
         Triangle tri=new Triangle();
        Shape sq=new Square();
        sq.area();
        circle.area();
        // shape.area();
    }
}
