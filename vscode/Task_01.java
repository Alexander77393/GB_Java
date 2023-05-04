package vscode;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;

class Task_01 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введите целое число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Вы ввели неверное число!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Введите положительное число!");
            else {
                System.out.printf("Число треугольника %d будет: %s! ", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("Факториал числа %d будет: %s! ", n, getFactorial(n));
            }
        }
        scn.close();
    }
}
