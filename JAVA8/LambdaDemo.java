package JAVA8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

interface Sum{
    int add(int a, int b);
}
interface largenum{
    int large(int a,int b);
}
public class LambdaDemo {
    public static void main(String[] args) {
        Sum obj2=new Sum(){
            @Override
            public  int add(int a, int b){
                return a+b;

            }
        };
        largenum obj=(a,b)-> a>b? a: b;
        System.out.println(obj.large(10,29));
        System.out.println(obj.large(1,10));
        Function <Integer,Double> fun=str->Double.valueOf(str);
        System.out.println(fun.apply(20));
        Consumer<String> printuppercase=str-> System.out.println(str.toLowerCase());
        printuppercase.accept("helloOHGRTGFH");
        Supplier <Double> x=()-> {
            return Math.random()*1;
        };
        System.out.println(x.get());


    }

}
