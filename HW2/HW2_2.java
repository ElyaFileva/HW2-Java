package ru.lesson1.HomeWork.HW2;

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Последовательность возрастающая " + ascendingSequence(n, sc));
    }

    public static boolean ascendingSequence(int k, Scanner sc1) {
        int num1 = sc1.nextInt();
        for (int i = 0; i < k; i++) {
            int num2 = sc1.nextInt();
            if (num2 > num1) {
                num1 = num2;
            } else return false;
        }
        return true;
    }
}
