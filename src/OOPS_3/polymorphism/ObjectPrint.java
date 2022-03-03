package OOPS_3.polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num=num;
    }
    public String toString(){
        return "Value= "+num;
    }
    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(120);
        System.out.println(obj);
    }
}
