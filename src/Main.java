public class Main {
    public static void main(String[] args) {
        int initialAccount = 1600;
        int addend = 1200;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalAccount = initialAccount + addend + bonus;
        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус: " + bonus);

    }
}
