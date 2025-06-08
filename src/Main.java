public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] pay = new int[5];
        pay[0] = 12000;
        pay[1] = 11000;
        pay[2] = 13000;
        pay[3] = 15000;
        pay[4] = 14000;
        int sum = 0;
        for (int i = 0; i < pay.length; i++) {
            sum += pay[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задача 2");

        int maxPayForWeek = pay[0];
        int minPayForWeek = pay[0];
        for (int i = 0; i < pay.length; i++) {
            final int current = pay[i];
            if (current > maxPayForWeek) {
                maxPayForWeek = current;
            }
        }
        System.out.println("Максимальная сумма трат в неделю составила " + maxPayForWeek + " рублей");
        for (int i = 0; i < pay.length; i++) {
            final int current = pay[i];
            if (current < minPayForWeek) {
                minPayForWeek = current;
            }
        }
        System.out.println("Минимальная сумма трат в неделю составила " + minPayForWeek + " рублей");

        System.out.println("Задача 3");

        int averagePay = - 1;
        for (int i = 0; i < pay.length; i++) {
            averagePay = sum / pay.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averagePay + " рублей");

        System.out.println("Задача 4");

        char[] reserveFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reserveFullName.length - 1; i >= 0; i--) {
            System.out.print(reserveFullName[i]);
        }
    }
}