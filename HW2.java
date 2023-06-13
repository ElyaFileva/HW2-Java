package ru.lesson1.HomeWork;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int b = sc.nextInt();
        for (int i = 0; i < n - 2; i++) {
            int num = sc.nextInt();
            if (b >= 0 && num < 0) {
                sum += b;
            }
            b = num;
        }
        System.out.println(0);
        System.out.println("sum = " + sum);
    }


}

