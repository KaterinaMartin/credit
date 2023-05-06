public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double r = 1_000_000;
        double m = 24;
        double p = 9.99;
        double payment = service.calculate(r, p, m);
        System.out.println( (int) payment);
    }
}