package ups.edu.ec.tdd.payment;

public interface PaymentGateway {
    public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
