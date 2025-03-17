package Second;
import  first.*;
public class madam {
    int i,j;
    static int k=10;
    static {
        System.out.println("hello i am static");
    }

    madam(int i,int j){
        this.i=i;
        this.j=j;


    }

//    int i,j;
//    void show(int i,int j){
//        System.out.println(i+j);
//    }
@Override
public String toString() {
    return "Madam Object [i = " + i + ", j = " + j + "]";
}

    public static void main(String[] args) {
        madam obj1=new madam(12,12);
        System.out.println(obj1.toString());
        madam.k=20;
        System.out.println(madam.k);

//        sir obj1=new sir("surendra",21);
//        System.out.println(obj1.toString());
    }
}
