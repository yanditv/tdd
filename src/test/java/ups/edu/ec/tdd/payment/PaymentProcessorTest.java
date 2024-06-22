package ups.edu.ec.tdd.payment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
private PaymentGateway gateway;
private PaymentProcessor processor;

@Before
public void setUp() {
    gateway = Mockito.mock(PaymentGateway.class);
    processor = new PaymentProcessor(gateway);
}
    @Test
    public void give_payment_when_is_assert_then_ok() {
        Mockito.when(gateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(processor.makePayment(100));
    }
    @Test
    public void give_payment_when_is_assert_then_error() {
        Mockito.when(gateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(processor.makePayment(100));
    }
}