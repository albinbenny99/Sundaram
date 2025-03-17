package AbstractionAndInterface;

abstract class Vehicle2{
//    String name,Type;
//    Vehicle2(String name,String Type){
//        this.name=name;
//        this.Type=Type;
//
//    }
    void display(){
//        return name+" "+Type;
        System.out.println("i am from abstract");
    }


}
class Car extends Vehicle2{
    int noOfTires;
//    Car(String name, String Type,int noOfTires) {
//        super(name, Type);
//        this.noOfTires=noOfTires;
//    }
    @Override
    void display(){
//        return name+" "+Type+" "+noOfTires;
        super.display();
        System.out.println("I am from extended class");
    }
}
public class AbstractionDemo1 {

    public static void main(String[] args) {
//        Car c1=new Car("bmw","automatic",20);
//        Vehicle2 v1=new Car("bmw","automatic",20);
        Car v1=new Car();
        v1.display();
//        v1.display();
//        System.out.println(c1.display());
//        System.out.println( v1.display());

    }
}

