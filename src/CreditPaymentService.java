public class CreditPaymentService {
    public double calculate (double r, double p, double m) {
        double payment = r * ((p / 1200) + ((p / 1200) / (Math.pow((1 + (p / 1200)), m) - 1)));
        return (int) payment;

        // r - сумма кредита
        // p - процентная ставка
        // m - количество месяцев
    }
}
