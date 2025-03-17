//
//DESCRIPTION
//Are you vaccinated?
//Do you know COVID-19 vaccine introduced in India is effective as any vaccine developed by other countries. Various phases of vaccine trials are undertaken to ensure its safety and efficacy.
//Here is a task for you!
//Complete the classes using the Specifications given below. Consider default visibility of classes, data fields, and methods unless mentioned otherwise.
//Specifications
//class definitions:
//class Vaccine:
//data members:
//int age
//float dosage
//visibility: private
//
//Vaccine(int age): constructor with public visibility
//Define getter setters with public visibility
//
//class VaccinationCamp:
//data member:
//ArrayList<Vaccine> list = new ArrayList<>();
//
//method definitions:
//assignVaccine():
//        return type: void
//
//vaccineInjected():
//        return type: float
//        Task
//Class Vaccine
//- define the int variable age.
//- define the float variable dosage.
//-define a constructor and getter setters according to the above specifications.
//        Class VaccinationCamp
//- define the ArrayList<Vaccine> variable list.
//Implement the below methods for this class:
//        -void assignVaccine():
//        •	The dosage of vaccine to be injected into a person is based on age, the guidelines are given below:
//        •	If age >=45, dosage = 250.
//        •	If age >= 20, dosage = 200.
//        •	If age < 20, dosage = 100.
//        •	Set the dosage according to the age in list.
//-float vaccineInjected():
//        •	Write a code to find the total vaccine dosage required to get all the people vaccinated
//•	Return the total dosage
//Refer to the sample output for clarity
//Sample Input
//VaccinationCamp vc = new VaccinationCamp();
// vc.list.add(new Vaccine(49));
//        vc.list.add(new Vaccine(26));
//        vc.list.add(new Vaccine(19));
//        ----------------------------------------------------------
//        vc.assignVaccine();
//vc.vaccineInjected();
//Sample Output
//550.0






        package Vaccination;

import java.util.ArrayList;

class Vaccine{
    public int age;
    float dosage ;
//    int age;
    Vaccine(int age){
     this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDosage() {
        return dosage;
    }

    public void setDosage(float dosage) {
        this.dosage = dosage;
    }
}
class vaccinationCamp{
    Vaccine v;
    ArrayList<Vaccine> list=new ArrayList<>();
    public void assignVaccine() {
        for (Vaccine v : list) {
            if (v.getAge() >= 45) {
                v.setDosage(250);
            } else if (v.getAge() >= 20) {
                v.setDosage(200);
            } else {
                v.setDosage(100);
            }
        }
    }
    public float vaccineInjected() {
        float totalDosage = 0;
        for (Vaccine v : list) {
            totalDosage += v.getDosage();
        }
        return totalDosage;
    }
}


public class VaccinationDemo {


    public static void main(String[] args) {
        vaccinationCamp vc = new vaccinationCamp();
        vc.list.add(new Vaccine(49));
        vc.list.add(new Vaccine(26));
        vc.list.add(new Vaccine(19));
        vc.assignVaccine();


        System.out.println(vc.vaccineInjected());
    }
}
