package ru.ayupov.task;

/**
 * Ряд Фибоначчи - это числовой ряд, в котором следующее число является суммой двух предыдущих чисел. *
 * Например : *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 и т. д. *
 * Есть два способа напечатать серии Фибоначчи. *
 * Используя итерацию *
 * Использование рекурсии *
 * Ваша задача реализовать оба способа.
 */


public class Main {

    public static void main(String[] args) {

        iterFibonacci(11);
        System.out.println();
        printRecFibonacci(11);
    }


    static void iterFibonacci(int size) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        for (int i = 0; i < size; i++) {
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }

    }

    static int recFibonacci(int num) {
        if (num < 2) {
            return num;
        } else {
            return recFibonacci(num - 1) + recFibonacci(num - 2);
        }
    }

    static void printRecFibonacci(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(recFibonacci(i) + " ");
        }
    }

}
