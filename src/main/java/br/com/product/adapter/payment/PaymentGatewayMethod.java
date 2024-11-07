package br.com.product.adapter.payment;

public class PaymentGatewayMethod implements PaymentGateway
{
    private final PaymentGateway paymentGateway;

    public PaymentGatewayMethod(PaymentGateway paymentGateway)
    {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment() {
        paymentGateway.processPayment();
    }

    @Override
    public double getTotalAmount() {
        return paymentGateway.getTotalAmount();
    }
}
