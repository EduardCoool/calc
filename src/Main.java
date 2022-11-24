public class Main {
    public static void main(String[] args) throws WrongInput {
        Scan creditInfo = new Scan(); // обявление объекта класса
        creditInfo.getInputData(); // использование метода класса Scan
        Сalculate service = new Сalculate();
        CreditData lol = new CreditData(creditInfo.sum,creditInfo.payment,creditInfo.percent,creditInfo.client);

        System.out.println("Переплата по процентам = " + service.calc(lol.getSum(), lol.getPayment(),  lol.getPercent(),  lol.getClient()));



    }


}