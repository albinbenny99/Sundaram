package JAVA8;
interface Vehicle{
    void speed();
    default void start(){
        System.out.println("car is starting");
    };

}
class car implements Vehicle{
    public void speed(){
        System.out.println("Car speed is 450kmph");
    }
//    @Override
//    public void start(){
//        System.out.println("car started");
//    }
}

public class DefaultDemo {
    public static void main(String[] args) {
        car c=new car();
        c.speed();
//        c.start();

        c.start();
    }
}
