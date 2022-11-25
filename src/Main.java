public class Main {
    public static void main(String[] args) throws WrongInput {
        Scan creditInfoInput = new Scan(); // обявление объекта класса
        CreditData savedDataCredit = creditInfoInput.getInputData();
        Сalculate service = new Сalculate();


        System.out.println("Переплата по процентам = " + service.calc(savedDataCredit.getSum(), savedDataCredit.getPayment(), savedDataCredit.getPercent(), savedDataCredit.getClient()));


    }


}