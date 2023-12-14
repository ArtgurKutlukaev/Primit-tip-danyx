public class Main {


    public static void main(String[] args) {

        int startingScore = 400; // начальный счет
        int replenishment = 1100; // сумма пополнения


        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println((bonus) + "Количество бонусов");
        System.out.println((startingScore + replenishment + bonus) + "итоговый счет");
    }
}