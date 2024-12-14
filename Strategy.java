// Payment Strategy Interface
interface PaymentStrategy {
    boolean pay(double amount);
}

// Concrete Strategy: CreditCard Payment
class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Credit Card: $" + amount);
        // Perform credit card payment logic
        return true;
    }
}

// Concrete Strategy: PayPal Payment
class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using PayPal: $" + amount);
        // Perform PayPal payment logic
        return true;
    }
}

// Concrete Strategy: Bank Transfer Payment
class BankPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Bank Transfer: $" + amount);
        // Perform bank transfer payment logic
        return true;
    }
}

// Concrete Strategy: Bkash Payment
class BkashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("Making payment using Bkash: $" + amount);
        // Perform Bkash payment logic
        return true;
    }
}

// Context Class: PaymentSystem
class PaymentSystem {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Process payment using the selected strategy
    public boolean makePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy is not set.");
            return false;
        }
        return paymentStrategy.pay(amount);
    }
}

// Main Class
public class Strategy {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();

        // Pay using Bank Transfer
        paymentSystem.setPaymentStrategy(new BankPayment());
        paymentSystem.makePayment(200);

        // Pay using Bkash
        paymentSystem.setPaymentStrategy(new BkashPayment());
        paymentSystem.makePayment(500);

        // Pay using Credit Card
        paymentSystem.setPaymentStrategy(new CreditCardPayment());
        paymentSystem.makePayment(5500);
    }
}

