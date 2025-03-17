package third;
abstract  class Car{
    abstract void start();
    static void stop(){
        System.out.println("car stopped");
    }
}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("tesla start with button");
    }
}
class  Bmw extends Car{
    @Override
    void start() {
        System.out.println("bmw start with key press");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {

        Car myTesla=new Tesla();
        myTesla.start();
        Car Bmw=new Bmw();
        Bmw.start();
        Car.stop();



    }
}
