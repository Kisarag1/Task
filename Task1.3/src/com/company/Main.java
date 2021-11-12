package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        System.out.println(Integer.toBinaryString(num));
        String str = new String(Integer.toBinaryString(num));
        System.out.print(str.split("1").length - 1);
    }
}

