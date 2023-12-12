public class Main {
    public static void main(String[] args) {

        int startingScore = 300; // начальный счет
        int replenishment = 1100; // сумма пополнения
        int bonus = 1;            // количество бонусов

        if (replenishment > 1000) {
            bonus = 1;
        }
        if (replenishment < 0) {
            bonus = 0;
        }
            System.out.println((bonus = replenishment / 100) + "Количество бонусов");

    }
}