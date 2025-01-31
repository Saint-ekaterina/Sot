public class main {

    public static void main(String[] args) {
        int x = 200; //начальная сумма на счету клиента
        int y = 1300; //сумма пополнения счета
        int bonus;


        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }
        System.out.println(x + y + bonus); //итоговая сумма на счету клиента
    }
}
