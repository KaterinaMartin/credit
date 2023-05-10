public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        double month = 24;
        double percent = 9.99;
        double payment = service.calculate(amount, percent, month);
        System.out.println( (int) payment);
    }
}