package CollectionsPractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add("Hello");
        set.add(42);
        set.add(3.14);
        set.add(true);
        set.add("world");
//        System.out.println(set);
//        System.out.println(set.contains("banaa"));
//        set.remove("banana");
//        System.out.println(set);
////        set.clear();
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        HashSet copyset=(HashSet) set.clone();
//        System.out.println(copyset);
        Iterator i=set.iterator();
        while (i.hasNext()){
            Object o=i.next();
            System.out.println(o+""+o.getClass());
        }
        if(set.contains(42)){
            System.out.println("present");
        }
        set.remove("world");
        System.out.println(set);
    }
}
