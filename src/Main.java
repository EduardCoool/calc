public class Main {
    public static void main(String[] args) throws WrongInput {
        Scan creditInfoInput = new Scan(); // обявление объекта класса
        CreditData SavedDataCredit = creditInfoInput.getInputData();
        Сalculate service = new Сalculate();


        System.out.println("Переплата по процентам = " + service.calc(SavedDataCredit.getSum(), SavedDataCredit.getPayment(),  SavedDataCredit.getPercent(),  SavedDataCredit.getClient()));



    }


}