package third;

class BankAccount {

    static double interestrate;
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    double amount;

    void deposit(double amount) {
        this.balance += amount;
    }

    void displayDetails() {
        System.out.println(this.accountHolder + "accoun number" + this.accountNumber + "balance" + this.balance);
    }

    void withdraw(double amount) {
        balance = balance - amount;
//        System.out.println(balance);

    }

  static void setInteresrate(double rate) {
     interestrate=rate;
//        interestrate = balance * rate / 100;
//        balance = balance + interestrate;
//       System.out.println(interestrate);
//        return balance;

    }
   void applyinterest(){
       interestrate = balance * interestrate / 100;
       balance = balance + interestrate;
       System.out.println(balance);


   }
    void displayDetails1() {
        System.out.println(this.accountHolder + "accoun number" + this.accountNumber + "balance" + this.balance + "interst rate" + interestrate);

    }
}
public class InheritenceDemo {

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("surendra", 1232, 1200.00);
        obj1.displayDetails();
        obj1.deposit(2000);
        obj1.displayDetails();
        obj1.withdraw(3000);
        obj1.displayDetails();
        BankAccount.setInteresrate(7);
        obj1.applyinterest();
        obj1.displayDetails1();


    }
}
