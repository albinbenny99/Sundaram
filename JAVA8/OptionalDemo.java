package JAVA8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> emptyoptional=Optional.empty();



        if(emptyoptional.isEmpty()){
            System.out.println("the optional");
        }
        else{
            System.out.println("The optional contain a value");
        }
    }
}
