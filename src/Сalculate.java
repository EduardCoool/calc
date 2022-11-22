public class Сalculate {
    public double cost;

    public double calc(double sum, double payment, double percent, String client) throws MyExeption {
        double cost = 0;
        if (payment * 12 <= sum * percent / 100) {
            throw new MyExeption();
        }
        if (client.equals("human")) {
            sum = sum;
        } else if (client.equals("business")) {
            sum = sum - payment * 12;
        } else {
            throw new MyExeption();
        }
        do {

            cost = cost + sum * percent / 100;
            //System.out.println("переплата по процентам = " + cost);

            sum = sum - payment * 12 + cost;
            //System.out.println("сумма долга = " + sum);


//            System.out.println("переплата по процентам = " + cost);


        } while (sum > 0);

        return cost;
    }
}