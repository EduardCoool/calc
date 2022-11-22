public class Сalculate {
    public double cost;

    public double calc(double sum, double payment, double percent, String client) throws WrongInput {
        if (payment * 12 <= sum * percent / 100) {
            throw new WrongInput("Кредит невозможно выплатить, такой лучше не брать.");
        }
        if (client.equals("human")) {

        } else if (client.equals("business")) {
            sum = sum - payment * 12;
        } else {
            throw new WrongInput("Неверный ввод типа клиета! Введите human или business.");
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