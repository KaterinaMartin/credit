public class CreditPaymentService {
    public double calculate (double amount, double percent, double month) {
        double payment = amount * ((percent / 1200) + ((percent / 1200) / (Math.pow((1 + (percent / 1200)), month) - 1)));
        return (int) payment;
    }
}
