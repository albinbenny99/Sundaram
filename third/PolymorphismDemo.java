package third;
class Employee{
    String name="surendra";
    String id="101";
    void dosomething(Employee e){
        System.out.println(e.name+""+e.id);
        if(e instanceof Manager1){
            Manager1 m=(Manager1)e;
            System.out.println(m.department);
        }
        if( e instanceof Clerk1){
            Clerk1 c=(Clerk1)e;
            System.out.println(c.pf);
        }
    }


}
class Manager1 extends Employee{
String department="cicil";

}
class Clerk1 extends Employee{
    int pf=20000;

}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Employee e=new Manager1();
        e.dosomething(e);
        e=new Clerk1();
        e.dosomething(e);



    }
}
