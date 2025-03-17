package PracticeForAssessment;

import java.lang.reflect.Array;
import java.util.*;

public class DuplicatesDemo {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        arr[3]=13;
        arr[4]=14;
        List<Integer> l1=new ArrayList( );
        for(int i:arr){
           l1.add(i);
        }
        System.out.println(l1);


    }

}