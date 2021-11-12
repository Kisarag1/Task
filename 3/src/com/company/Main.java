package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір массиву ");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] a = new int[size1][size2];
        Random rand = new Random();
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                a[i][j] = rand.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < size1; i++, System.out.println()) {
            for (int j = 0; j < size2; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

    }
}
