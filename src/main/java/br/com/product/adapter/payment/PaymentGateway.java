package br.com.product.adapter.payment;

public interface PaymentGateway
{
    void processPayment();
    double getTotalAmount();
}
