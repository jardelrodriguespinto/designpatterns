package br.com.product.adapter.payment;

public class PayPalPayment implements PaymentGateway
{
    private double amount;
    @Override
    public void processPayment(){
        System.out.println("Process payment via PayPal");
    }
    @Override
    public  double getTotalAmount(){
        return amount;
    }
}
