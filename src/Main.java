import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongInput {
        Scan creditInfo = new Scan(); // обявление объекта класса
        creditInfo.getInputData(); // использование метода класса Scan
        Сalculate service = new Сalculate();
        System.out.println("Переплата по процентам = " + service.calc(creditInfo.sum, creditInfo.payment, creditInfo.percent, creditInfo.client));

    }


}