package third;
abstract class Employee1{
    int employeeId;
    String employeeName;
    double salary;

    Employee1(int employeeId,String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//    abstract  void calculateSalary();

    abstract void calculateSalary();
}
class PermenentEmployee extends  Employee1{
    double basicPay;
    PermenentEmployee(int employeeId,String employeeName,double basicPay){
        super(employeeId,employeeName);
        this.basicPay=basicPay;
        System.out.println(basicPay);

    }

//    void calculateSalary(double basicPay){
//
//    }

    @Override
    void calculateSalary() {

        salary=basicPay-(0.12*basicPay);
        setSalary(salary);


    }
}
class TemporaryEmployee extends  Employee1{
    int hoursWorked;int wagePerHour;
    TemporaryEmployee(int employeeId,String employeeName,int hoursWorked,int wagePerHour){
        super(employeeId,employeeName);
        this.hoursWorked=hoursWorked;
        this.wagePerHour=wagePerHour;


    }
    @Override

    void calculateSalary() {
        setSalary(hoursWorked*wagePerHour);

    }
}
class Loan{

}

public class AbstractionEmployeeLoanDemo {
    public static void main(String[] args) {
        Employee1 e=new PermenentEmployee(10,"surendra",200000.00);
//        e.setSalary(20000);
        e.calculateSalary();
        System.out.println(e.getSalary());
//        System.out.println(e.getSalary());



    }
}
