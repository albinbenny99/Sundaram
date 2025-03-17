package CollectionsPractices;

import java.util.HashMap;
import java.util.Map;

class Teacher1{
    private int id;
    private String name ;
    double salary;
    Teacher1(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class HashMapDemo {
    static   void displayDetails(HashMap<Integer,Teacher1> p){

        for (Map.Entry<Integer,Teacher1> m: p.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());

        }

    }
    public static void main(String[] args) {
        HashMap<Integer,Teacher1> hashlist=new HashMap();
        Teacher1 t1=new Teacher1(100,"surendra",200000);
        Teacher1 t2=new Teacher1(101,"chinna",10000);
        Teacher1 t3=new Teacher1(102,"ppsuman",300000);
        hashlist.put(t1.getId(),t1);
        hashlist.put(t2.getId(),t2);
        hashlist.put(t3.getId(),t3);
       displayDetails(hashlist);
        System.out.println(hashlist.get(102));
    }

//    for(Map.Entry<Integer,Teacher1> ){
//
//    }




}
