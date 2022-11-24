import java.util.Objects;
import java.util.Scanner;

public class Scan {
    double sum;
    double payment;
    double percent;
    String client;

    public void getInputData() throws WrongInput {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, ежемесячный платёж, процент, тип клиента");
        String s = in.nextLine();
        String[] array = s.split(" ");// массив строк


        sum = Double.parseDouble(array[0]);
        payment = Double.parseDouble(array[1]);
        percent = Double.parseDouble(array[2]);
        client = array[3];

        if (sum <= 0 || payment <= 0 || percent <= 0) {
            throw new WrongInput("Неверный ввод данных! Введите корректные значения суммы кредита, ежемесячного платежа, процентную ставку.");
        } else if (payment * 12 <= sum * percent / 100) {
            throw new WrongInput("Кредит невозможно выплатить, такой лучше не брать.");
        } else if (!Objects.equals(client, "human") && !Objects.equals(client, "business")) {
            throw new WrongInput("Неверный ввод типа клиета! Введите human или business.");


        }

    }


}
