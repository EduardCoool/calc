public class MyExeption extends Exception {
    private static final String string = "Неверный ввод данных!";

    public MyExeption() {
        super(string);
    }

}
