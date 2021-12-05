public class DifferentialPaymentCalculator {
    public double paymentCalculator(double credit, double yearPercent, double creditMonths) {

        double monthsOfTheYear = 12;
        yearPercent = yearPercent / 100;
       // double debit = credit - (credit / creditMonths);

        double differentialPayment = credit / creditMonths + credit * (yearPercent / monthsOfTheYear);

        return differentialPayment;
    }
}

