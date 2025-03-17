package first;


class Vehicle{
    String  brand;int speed;
    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    void display(){
        System.out.println(brand+speed);
    }
//    void display(int numDoors){
//        System.out.println(brand+speed+numDoors);
//    }


}
class  car extends Vehicle{
    int numDoors;
    car(String brand,int speed,int numDoors){
        super(brand, speed);
        this.numDoors=numDoors;


    }

    @Override
    void display() {
//        System.out.println();
        System.out.println(brand+speed+numDoors);
    }

}




public class Main {
    public static void main(String[] args) {
        Vehicle obj1=new Vehicle("bmw",20);
//        System.out.println(obj1);
        car obj2=new car("bmw",30,4);
        obj1.display();
        obj2.display();

    }
}
