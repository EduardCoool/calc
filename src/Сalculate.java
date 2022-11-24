public class Сalculate {
    public double cost;

    public double calc(double sum, double payment, double percent, String client) throws WrongInput {
        if (client.equals("business")) {
            sum = sum - payment * 12;
        }
        while (sum > 0) {

            cost = cost + sum * percent / 100;
            //System.out.println("переплата по процентам = " + cost);

            sum = sum - payment * 12 + cost;
            //System.out.println("сумма долга = " + sum);

//            System.out.println("переплата по процентам = " + cost);
        }
        return cost;
    }
}