package CollectionsPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemoAssignment {
    public static void main(String[] args) {
        ArrayList arrlist=new ArrayList<>(Arrays.asList("java",100,3.14f,"Spring",true));
//        arrlist.add("java");
//        arrlist.addsbgj
        ListIterator iterator=arrlist.listIterator();
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
            //System.out.println(o+""+ o.getClass());
        }
    }
}
