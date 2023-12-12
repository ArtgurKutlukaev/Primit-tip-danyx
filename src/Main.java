public class Main {
    public static void main(String[] args) {

        int startingScore = 400; // начальный счет
        int replenishment = 1100; // сумма пополнения
        int bonus = 1;            // количество бонусов

        if (replenishment > 1000) {
            bonus = 1;
        }
        if (replenishment < 1000) {
            bonus = 0;
        }
        System.out.println((replenishment / 100) + "Количество бонусов");
        bonus = 1100 / 100;
        System.out.println((startingScore + 1100) + "итоговый счет");
    }
}