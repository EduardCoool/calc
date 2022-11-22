import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyExeption {
        Scan one = new Scan();
        one.scanone();
        Сalculate service = new Сalculate();
        System.out.println("Переплата по процентам = " + service.calc(one.sum, one.payment, one.percent, one.client));

    }


}