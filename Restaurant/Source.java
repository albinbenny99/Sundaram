package Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        ArrayList<Restaurant> al=new ArrayList<>();

        Dao d=new Dao();
        System.out.println("choose option");
        Scanner chooseopt=new Scanner(System.in);
        int choice= chooseopt.nextInt();
        if(choice==1){
            d.addRestaurant(al);

        } else if (choice==2) {
            d.addRestaurant(al);
            System.out.println("Search Result  "+d.searcRestaurant(al,"Adigas"));
        }
        else{
            System.out.println("Invalid choice");;
        }
//        System.out.println( d.searcRestaurant(al,"Adigas"));

    }
}
