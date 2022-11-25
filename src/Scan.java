import java.util.Objects;
import java.util.Scanner;

public class Scan {

    public CreditData getInputData() throws WrongInput {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, ежемесячный платёж, процент, тип клиента");
        String s = in.nextLine();
        String[] array = s.split(" ");// массив строк

        CreditData dataAboutCredit = new CreditData();
        dataAboutCredit.setSum(Double.parseDouble(array[0]));
        dataAboutCredit.setPayment(Double.parseDouble(array[1]));
        dataAboutCredit.setPercent(Double.parseDouble(array[2]));
        dataAboutCredit.setClient(array[3]);

        if (dataAboutCredit.getSum() <= 0 || dataAboutCredit.getPayment() <= 0 || dataAboutCredit.getPercent() <= 0) {
            throw new WrongInput("Неверный ввод данных! Введите корректные значения суммы кредита, " +
                    "ежемесячного платежа, процентную ставку.");
        } else if (dataAboutCredit.getPayment() * 12 <= dataAboutCredit.getSum() * dataAboutCredit.getPercent() / 100) {
            throw new WrongInput("Кредит невозможно выплатить, " +
                    "такой лучше не брать.");
        } else if (!Objects.equals(dataAboutCredit.getClient(), "human") &&
                !Objects.equals(dataAboutCredit.getClient(), "business")) {
            throw new WrongInput("Неверный ввод типа клиета! Введите human или business.");


        }
        return dataAboutCredit;
    }


}
