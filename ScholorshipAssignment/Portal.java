package ScholorshipAssignment;

import java.util.ArrayList;

class Scholorship{

    ArrayList<Student1> stlist=new ArrayList<>();
    void assignScholorShip(){
        for(Student1 s:stlist){
            if(s.getPercentage()>=91){
                s.setScholarship(10000);

            }
            else if(s.getPercentage()>=81){
                s.setScholarship(5000);

            }
           else if(s.getScholarship()<80){
               s.setScholarship(0);
           }
           else {
                System.out.println("invalid percentage");
            }
        }


    }

    float totalScholorship() {
        float totalScholorship = 0;
        for (Student1 s : stlist) {
//            totalScholorship = 0;
            totalScholorship = totalScholorship + s.getScholarship();
//            System.out.println(totalScholorship+"i am from total sch");
        }
        return totalScholorship;
    }
     String totalMaxScholorship(){
        float max=0;
         String collegeName = "";
        for (Student1 st :stlist){
            if(st.getScholarship()>max){
               max=st.getScholarship();
               collegeName=st.getCollegeName();
            }


        }
        return collegeName;
    }
}
public class Portal {
    public static void main(String[] args) {
        Scholorship obj=new Scholorship();
        obj.stlist.add(new Student1("Steve", "IIT", 89));
        obj.stlist.add(new Student1("Bob", "NIT", 94));
        obj.stlist.add(new Student1("Alice", "Abcd", 59));
        obj.assignScholorShip();
        System.out.println(obj.totalScholorship());
        System.out.println(obj.totalMaxScholorship());

    }
}
