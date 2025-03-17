package PracticeForAssessment;

class BankAccout{

    private double balance=0;

    public BankAccout(double balance) {
        this.balance = balance;
    }


    public double deposit(double amount){
        if(amount<0){
            System.out.println("Amount should not be negative");
        }
        else{
            balance=balance+amount;
        }

        return  balance;

    }
    void withdraw(double amount){
        if(amount>getBalance()){
            System.out.println("Insufficient balnce");
        }
        else{
            balance=balance-amount;
            System.out.println("withdrwan "+""+amount);
        }



    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
//    void display(){
//        System.out.println(balance);
//    }
}
public class InheritanceMain {
    public static void main(String[] args) {
        BankAccout bc=new BankAccout(0);
        bc.deposit(2000);
        bc.deposit(4000);
        bc.withdraw(1);
        System.out.println( bc.getBalance());
    }

}
