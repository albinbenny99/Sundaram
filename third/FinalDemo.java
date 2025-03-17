package third;
class Demo {
   static int x = 10; // This value cannot be changed

    void changeValue() {
         x = 20; // ❌ ERROR! Cannot change final variable
        System.out.println(x);
    }
}

public class FinalDemo {

    public static void main(String[] args) {
          Demo m=new Demo();
          m.changeValue();
//        System.out.println(FinalDemo.pi);

    }
}
