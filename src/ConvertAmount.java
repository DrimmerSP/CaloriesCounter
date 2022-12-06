import java.util.Scanner;

public class ConvertAmount {

    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double rubbles;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество долларов: ");
        dollars = scanner.nextInt();
        scanner.close();

        rubbles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println("Сумма денег в российских рублях равна: " + (int)(rubbles * 100) / 100.0);
    }
}
