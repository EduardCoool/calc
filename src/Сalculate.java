public class Сalculate {
    public double cost;


    public double calc(double sumcredit, double paymentcredit, double percentcredit, String clientcredit) {
        if (clientcredit.equals("business")) {
            sumcredit = sumcredit - paymentcredit * 12;
        }
        while (sumcredit > 0) {
            cost = cost + sumcredit * percentcredit / 100;


            sumcredit = sumcredit - paymentcredit * 12 + cost;

        }
        return cost;
    }
}