import java.util.Scanner;

public class Scan {
    double sum;
    double payment;
    double percent;
    String client;
    public void scanone() throws MyExeption {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, ежемесячный платёж, процент, тип клиента");
        String s = in.nextLine();
        String[] array = s.split(" ");// массив строк


        sum = Double.valueOf(array[0]);
        payment= Double.valueOf(array[1]);
        percent = Double.valueOf(array[2]);
        client = array[3];

        if (sum <= 0 || payment <= 0 || percent <= 0) {
            throw new MyExeption();
        }

    }



}