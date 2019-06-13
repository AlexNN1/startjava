package com.startjava.Lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
//        int num;
//        int[] arr0 = {3, 9, 11, 15};
//        num = arr0[0];
//        arr0[0] = arr0[1];
//        arr0[1] = num;
//        for (int i : arr0) {
//            System.out.print(" " + i);
//        }
//
//        System.out.println();
//        System.out.println();
//
//        int[] arr1 = new int[15];
//        for (int i = 2, j = 0; j < arr1.length; j++) {
//            arr1[j] = i;
//            i += 2;
//            System.out.print(" " + arr1[j]);
//        }
//
//        System.out.println();
//        System.out.println();
//
//        int[] arr2 = new int[50];
//        for (int i = 1, k = 0; k < arr2.length; k++) {
//            arr2[k] = i;
//            i += 2;
//            System.out.print(" " + arr2[k]);
//            if (k % 15 == 0) {
//                System.out.println();
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for(int i = 49; i > -1; i--) {
//            System.out.print(" " + arr2[i]);
//            if(i % 15 == 0) {
//                System.out.println();
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//
//        int[] arr3 = new int[20];
//        arr3[0] = 1;
//        arr3[1] = 1;
//        for(int i = 2; i < arr3.length; i++) {
//            arr3[i] = arr3[i - 1] + arr3[i -2];
//        }
//        for (int i : arr3) {
//            System.out.print(" " + i);
//        }
//
//        System.out.println();
//        System.out.println();
//
//        int[] arr4 = new int[] {4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19};
//        Arrays.sort(arr4);
//        System.out.print(arr4[11]);

//В массиве, содержащем положительные и отрицательные целые числа,
// вычислить сумму четных положительных элементов.

//        System.out.println();
//        System.out.println();
//
//        int[] arr5 = new int[] {1,2,3,4,5,6,7,8,9,10,11};
//        for(int i = 0; i < arr5.length; i++) {
//            if(arr5[i] % 2 == 0) {
//                System.out.print(" " + arr5[i]);
//            }
//        }

//В массиве найти максимальный элемент с четным индексом.
//
//        System.out.println();
//        System.out.println();
//
//        int[] arr6 = new int[23];
//        for(int i = 0; i < arr6.length; i++) {
//            arr6[i] = (int) Math.round((Math.random() * 321));
//            System.out.print(" " + arr6[i]);
//        }
//        System.out.println();
//        Arrays.sort(arr6);
//        int max = Integer.MIN_VALUE;
//        for (int value : arr6) {
//            if (value % 2 == 0) {
//                max = Math.max(max, value);
//            }
//        }
//        System.out.print("=" + max + "=");

//Найти в массиве те элементы, значение которых меньше
// среднего арифметического, взятого от всех элементов массива.
//        double s = 0;
//        int[] arr7 = new int[4];
//        for(int i = 0, k = 0, j = 0; i < arr7.length; i++) {
//            arr7[i] = (int) Math.round((Math.random() * 21));
//            System.out.print(arr7[i] + " ");
//            j = arr7.length;
//            k += arr7[i];
//            s = k / j;
//        }
//        System.out.println();
//        for (int value : arr7) {
//            if (value < s) {
//                System.out.print(value + ", ");
//            }
//        }

//В одномерном массиве целых чисел определить два наименьших
// элемента. Они могут быть как равны между собой
// (оба являться минимальными), так и различаться.
//
//        int[] arr8 = new int[16];
//        for(int i = 0; i < arr8.length; i++) {
//            arr8[i] = (int) Math.round((Math.random() * 21));
//            System.out.print(arr8[i] + " ");
//        }
//        Arrays.sort(arr8);
//        System.out.println();
//        System.out.print(arr8[0] + ", " + arr8[1]);

//Сжать массив, удалив из него все элементы, величина которых
// находится в интервале [а, b]. Освободившиеся в конце массива
// элементы заполнить нулями.
        int[] arr9 = new int[8];
        for(int i = 0; i < arr9.length; i++) {
//            arr9[i] = (int) Math.round((Math.random() * 7));
            arr9[i] = i;
            System.out.print(arr9[i] + " ");
        }
        Arrays.sort(arr9);
        System.out.println();
        int k = 0;
        for(int i = arr9.length - 1, j, a = 3, b = 5; i > -1; i--) {
            if(arr9[i] >= a && arr9[i] <= b) {
                j = arr9[i];
                k++;
                System.out.print("=" + j +"=   ");
                for (j = j + 1; j < arr9.length; j++) {
                    arr9[j - 1] = arr9[j];
                }
            }
        }
        System.out.println();
        System.out.print(k);
        for(int i = arr9.length - 1; k > 0; i--, k--) {
            arr9[i] = 0;
        }
        System.out.println();
        for (int value: arr9) {
            System.out.print(value + " ");
        }
    }
}