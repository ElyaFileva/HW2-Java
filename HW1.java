package ru.lesson1.HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringNew = sc.nextLine().replaceAll("\\s+", " ").trim();
        reverseWordsInString(stringNew);
    }

    public static void reverseWordsInString(String stringNew) {
        String[] arrayStr = stringNew.split(" ");
        int k = arrayStr.length - 1;
        String lastElem = arrayStr[k];
        for (int i = 0; i < arrayStr.length / 2; i++) {
            arrayStr[k] = arrayStr[i];
            arrayStr[i] = lastElem;
            k--;
            lastElem = arrayStr[k];
        }
        System.out.print(String.join(" ", arrayStr));
    }
}
