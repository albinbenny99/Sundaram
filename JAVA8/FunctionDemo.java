package JAVA8;

import java.util.function.BiFunction;
import java.util.function.Function;
interface IamInt{
    void display1(String msg);
}
public class FunctionDemo {
    static int handlesum(int a,int b){
        return a+b;
    }
    public String display1(String msg){
        return msg.toUpperCase();

    }


    public static void main(String[] args) {
        Function<Integer,Double> fun=(number)->Math.sqrt(20);
        Function<Integer,Double> fun1=Math::sqrt;



        System.out.println(fun.apply(20));
        BiFunction<Integer,Integer,Integer> fun2=FunctionDemo::handlesum;
        System.out.println(fun2.apply(20,20)) ;
        FunctionDemo fd=new FunctionDemo();
        System.out.println(fd.display1("Hello"));

    }
}
