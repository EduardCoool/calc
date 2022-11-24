public class Main {
    public static void main(String[] args) throws WrongInput {
        Scan creditInfo = new Scan(); // обявление объекта класса
        CreditData info = creditInfo.getInputData();
        Сalculate service = new Сalculate();


        System.out.println("Переплата по процентам = " + service.calc(info.getSum(), info.getPayment(),  info.getPercent(),  info.getClient()));



    }


}