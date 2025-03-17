package JAVA8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Parrot{
   int Parrot_Id ;
   String name;
   Parrot(int Parrot_Id,String name){
       this.Parrot_Id=Parrot_Id;
       this.name=name;

   }

    public int getParrot_Id() {
        return Parrot_Id;
    }

    public void setParrot_Id(int parrot_Id) {
        Parrot_Id = parrot_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "Parrot_Id=" + Parrot_Id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class StreamDemo {
    public static void main(String[] args) {
        List  l=new ArrayList<>(Arrays.asList(12,24,10,5,29,24));
//        l.stream().forEach((a)-> System.out.println(a));
//       List<Integer> l1= l.stream().filter((a)->a>5).toList();
//        l.forEach(System.out::println);
//       l.sort((a,b)->b-a);
//        System.out.println(l);
//        List <Integer> l2=l.stream().map((a)->a*2).toList();
//        System.out.println(l2);
        List <Integer> l1=l.stream().distinct().toList();
        System.out.println(l1);
        System.out.println(l1.stream().filter((i) -> i>20).toList());

        List <Integer> list1=new ArrayList<>(Arrays.asList(12,24,10,5,29,24));
//        int count;
        List <Integer> evenNum=list1.stream().filter((i)->i%2==0).toList();
//        System.out.println(evenNum+""+evenNum.stream().count());
        long evencount=evenNum.stream().count();
        List <Integer> oddNum=list1.stream().filter((i)->i%2!=0).toList();
        System.out.println(list1.stream().sorted(Comparator.naturalOrder()).toList()+"i am sorted");
        System.out.println(list1.stream().sorted(Comparator.reverseOrder()).toList()+"i am reverse sorted");
      long oddcount=oddNum.stream().count();
        Map mp=new HashMap<>();
        mp.put("even",evencount);
        mp.put("odd",oddcount);
        System.out.println(mp);
        int sum=list1.stream().reduce(0,(acc,b)->acc+b);
        System.out.println(sum);
        int[] list={1,2,3,4};
//        System.out.println( Arrays.stream(list).filter((a)->a==2).forEach((i)-> System.out.println(i+"iami")));
        Arrays.stream(list)
                .filter(a -> a>0)
                .forEach(i -> System.out.println(i + " iami"));

        System.out.println(Arrays.stream(list).anyMatch((i->i==2000)));
        ArrayList<Parrot> al=new ArrayList<>();
        al.add(new Parrot(201,"chitti"));
        al.add(new Parrot(202,"bujji"));
        Map <Integer,String> ml=al.stream().collect(Collectors.toMap(P->P.Parrot_Id, P-> P.name));
        System.out.println(ml);

    }
}
