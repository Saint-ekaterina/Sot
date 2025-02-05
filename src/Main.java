public class Main {

    public static void main(String[] args) {
        int balanse = 200; //начальная сумма на счету клиента
        int refill = 1300; //сумма пополнения счета
        int bonus;


        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговая сумма на счету клиента:");
        System.out.println((balanse + refill + bonus) + " рубля(ей)");
    }
}
