package CollectionsPractices;

import java.util.ArrayList;

//used to restrict the collections to hold one type
public class GenericsDemo {
     class Product{
         int pid;String name;int price;
         Product(int pid,String name,int price){
             this.pid=pid;
             this.name=name;
             this.price=price;

         }

         @Override
         public String toString() {
             return pid+name+price;
         }
     }
    public void main(String[] args) {

        ArrayList<Product> pl=new ArrayList<>();
        pl.add(new Product(101,"iphone",20000));
       pl.add(new Product(102,"samsung",20000));
       pl.add(new Product(103,"sam",18000));
       for(Product p :pl){
           if(p.price>18000){
               System.out.println(p);
           }
       }
    }
}
