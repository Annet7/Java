package homeWork.homeWork1;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class mission1 {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number;
        int sum = 0;
        int mult = 1;
        number = userNumber.nextInt();
        userNumber.close();
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("треугольного число равно "+ sum);

        for (int i = 1; i <= number; i++) {
            mult *= i;
        }
        System.out.println("Факториал числа равен " + mult);
    }
}
