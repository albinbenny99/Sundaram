package Practice;
class A{
    String name;
    int id,Age;
    A(String name,int Age,int id){
        this.name=name;
        this.Age=Age;
        this.id=id;

    }

    @Override
    public String toString() {
        return name+""+Age+""+id;
    }
}
//class B{
//
//}
public class InhDemo {
    public static void main(String [] args){
        A a=new A("surendra",21,201);
        System.out.println(a);


    }
}
