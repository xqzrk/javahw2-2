public class Main {
    public static void main(String[] args) {
        int start = 100; // начальная сумма на счету
        int add = 2000; // сумма пополнения
        int bonus = (add / 100);
        if (add > 1000) {
            System.out.println("На счету " + (start + add + bonus) + " р.");
            System.out.println("Получено " + bonus + " р. в виде бонусов");
        } else {
            System.out.println("На счету " + (start + add) + " р.");
            System.out.println("Вы не получили бонусных рублей :(");
        }
    }
}