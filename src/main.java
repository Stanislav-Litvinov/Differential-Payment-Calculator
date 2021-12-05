public class main {
    public static void main(String[] args) {
        DifferentialPaymentCalculator differentialCredit = new DifferentialPaymentCalculator();

        double ucser1 = differentialCredit.paymentCalculator(1_000_000, 9.99, 36);
        System.out.println(ucser1);
    }
}
