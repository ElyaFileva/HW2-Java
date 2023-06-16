package ru.lesson1.HomeWork.HW2;

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Сумма простых чисел равна " + sumPrimeNumber(n, sc));
    }

    public static int sumPrimeNumber(int k, Scanner sc1) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = sc1.nextInt();
            if (primeNumber(num) == true)
                sum += num;
        }
        return (sum);
    }

    public static boolean primeNumber(int num) {
        if (num == 0 || num == 1)
            return false;
        if (num == 2 || num == 3 || num == 5 || num == 7)
            return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
