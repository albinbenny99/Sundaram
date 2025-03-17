package CollectionsPractices;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,10,3,4));
        list1.add(1,11);
        System.out.println(list1.get(2));
        list1.set(1,12);
        list1.remove(1);
        System.out.println(list1.size()+"size");
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains(1));
        Iterator<Integer> iterator=list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collections.sort(list1);
//        System.out.println(list1);
//        list1.clear();
        System.out.println(list1.getFirst()+"   iamajshdsj");

//        list1.add(1);
//        list1.add(2);
//        for(int x:list1){
//            System.out.println(x);
//        }
        ArrayList<Integer> copylist=(ArrayList<Integer>) list1.clone();
        System.out.println(list1);
        System.out.println(copylist+"i am copylist");
    }
}
