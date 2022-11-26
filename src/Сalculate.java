public class Сalculate {
    public double cost;
    public double costsum;

    public double calc(double sumcredit, double paymentcredit, double percentcredit, String clientcredit) {
        if (clientcredit.equals("business")) {
            sumcredit = sumcredit - paymentcredit * 12;
        }
        while (sumcredit > 0) {
            costsum = costsum + sumcredit * percentcredit / 100;
            cost = sumcredit * percentcredit / 100;

            sumcredit = sumcredit - paymentcredit * 12 + cost;

        }
        return costsum;
    }
}