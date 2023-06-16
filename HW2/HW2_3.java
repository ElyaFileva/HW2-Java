package ru.lesson1.HomeWork.HW2;

import java.util.Arrays;

import static java.lang.Math.abs;

public class HW2_3 {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int sumIn = getSumIndexTwoDigitNum(array);
        System.out.println(Arrays.toString(exchangeNegativeElemArray(array, sumIn)));
    }

    public static int getSumIndexTwoDigitNum(int[] arr) {
        int sumIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (abs(arr[i]) >= 10 && abs(arr[i]) < 100)
                sumIndex += i;
        }
        return sumIndex;
    }

    public static int[] exchangeNegativeElemArray(int[] arr, int sumIn) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = sumIn;
        }
        return arr;
    }
}
