package br.com.product.adapter.payment;

public class BankTransferPayment implements PaymentGateway
{
    private double amount;
    @Override
    public void processPayment(){
        System.out.println("Process payment via bank transfer");
    }
    @Override
    public  double getTotalAmount(){
        return amount;
    }
}
