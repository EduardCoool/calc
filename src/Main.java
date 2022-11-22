import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyExeption {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, ежемесячный платёж, процент, тип клиента");
        String s = in.nextLine();
        String[] array = s.split(" ");// массив строк

        Сalculate service = new Сalculate();
        double sum = Double.valueOf(array[0]);
        double payment = Double.valueOf(array[1]);
        double percent = Double.valueOf(array[2]);
        String client = array[3];
        if (sum <= 0 || payment <= 0 || percent <= 0) {
            throw new MyExeption();
        }
        double fs = service.calc(sum, payment, percent, client);
        System.out.println("Переплата по процентам = " + fs);
    }


}