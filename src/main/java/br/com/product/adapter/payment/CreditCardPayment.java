package br.com.product.adapter.payment;

public class CreditCardPayment implements PaymentGateway
{
    private double amount;
    @Override
    public void processPayment(){
        System.out.println("Process payment via credit card");
    }
    @Override
    public  double getTotalAmount(){
        return amount;
    }
}
