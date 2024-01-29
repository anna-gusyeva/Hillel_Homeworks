package com.gusyevaanna.homeworks.homework2;
//Вывести число в полуинтервале [0, n) циклом
//Вывести число в полуинтервале [0, n) хвостовой рекурсией
//Перевернуть строку методом двух указателей
//Вывести строку задом наперед с использованием стековой рекурсии
//Решить 2 3 4 5 11 задачи из прошлой домашки с использованием хвостовой рекурсии

public class Main2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Первое задание");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Второе задание");
        print(0, n);
        System.out.println();
        System.out.println("Третье задание");
        String str = "doable task";
        char[] arr = str.toCharArray();
        for (int i = 0, m = arr.length - 1; i < m; i++, m--) {
            char temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
        }
        System.out.println(arr);
        System.out.println("Четвёртое задание");
        String str1 = "doable task";
        char[] arr1 = str.toCharArray();
        print2(0, arr1);
    }

    private static void print2(int i, char[] arr) {
        if(i < arr.length) {
            print2(i + 1, arr);
            System.out.print(arr[i]);
        }
    }

    private static void print(int i, int n) {
        if (i < n) {
            System.out.print(i + " ");
            print(i + 1, n);
        }
    }
}