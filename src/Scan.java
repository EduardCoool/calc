import java.util.Objects;
import java.util.Scanner;

public class Scan {


    public CreditData getInputData() throws WrongInput {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, ежемесячный платёж, процент, тип клиента");
        String s = in.nextLine();
        String[] array = s.split(" ");// массив строк

        CreditData datainfo = new CreditData(Double.parseDouble(array[0]),Double.parseDouble(array[1]),Double.parseDouble(array[2]),array[3] );

        if (datainfo.getSum() <= 0 || datainfo.getPayment() <= 0 || datainfo.getPercent() <= 0) {
            throw new WrongInput("Неверный ввод данных! Введите корректные значения суммы кредита, ежемесячного платежа, процентную ставку.");
        } else if (datainfo.getPayment() * 12 <= datainfo.getSum() * datainfo.getPercent() / 100) {
            throw new WrongInput("Кредит невозможно выплатить, такой лучше не брать.");
        } else if (!Objects.equals(datainfo.getClient(), "human") && !Objects.equals(datainfo.getClient(), "business")) {
            throw new WrongInput("Неверный ввод типа клиета! Введите human или business.");


        }
        return datainfo ;
    }


}
