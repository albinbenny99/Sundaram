package third;
interface Payment{
    void pay(double amount);
}

interface  getPaymentMethod{
    void getPayMethod(String paymentMethod);
}
class creditcard implements Payment{
    public void pay(double amount){
        System.out.println(amount+"Processing using creditcard");
    }


}
class PayPalPayments implements Payment{
    public void pay(double amount){
        System.out.println("Processing Paypal payments");

    }
}
class BankTransferPayment implements Payment{
    public void pay(double amount){
        System.out.println("procced i=bank transfer");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
     Payment p=new creditcard();
     p.pay(10000);

    }
}
