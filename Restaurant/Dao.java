package Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Dao {

    Restaurant searcRestaurant(ArrayList<Restaurant> contacts,String Info) {
        for (Restaurant r : contacts) {
            if (r.getName().equals(Info)) {
                return r;
            }


        }
        return null;
    }
    void addRestaurant(ArrayList<Restaurant> al){
        Restaurant r1=new Restaurant("NH8","Indiranagar","Indian","4");
        Restaurant r2=new Restaurant("Adigas","Indiranagar","indian","4");
        al.add(r1);
        al.add(r2);
        System.out.println("List Of Restaurants "+al);



    }
    public static void main(String[] args) {

    }
}
