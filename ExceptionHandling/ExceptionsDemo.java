package ExceptionHandling;

import java.util.Scanner;

public class ExceptionsDemo {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    void checkexception(){
//
        if(num<0){
            throw new IllegalArgumentException("Negative number not allowed");

        }
        if(num==0){
            throw new ArithmeticException("Zero is invalid output");

        }
        else{
            System.out.println("valid number entered");
        }
    }
    Scanner scc=new Scanner(System.in);
     String str=scc.nextLine();
    void CheckStringException(){
        if(str.isEmpty()){
            throw new IllegalArgumentException("input cant be empty");

        }
        if(str.length()<5){
            throw new RuntimeException("length must be atleast 5 characters");
        }
        else{
            System.out.println("valid input");
        }


    }
    public static void main(String[] args) {
    ExceptionsDemo ed=new ExceptionsDemo();
    try {
       ed.CheckStringException();
    }
    catch (Exception e){
        System.out.println(e);
    }
    try{
      ed.checkexception();
    }
    catch(Exception e){
        System.out.println(e);

    }
    finally {
        System.out.println("hello i a final");
    }
    }
}
