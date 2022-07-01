package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Привет! Введите строку:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
            System.out.println(str);
            System.out.println(flipString(str));
            repeatFlip(str,1000);
            repeatFlip(str, 10000);
            repeatFlip(str, 100000);
    }
    //перевертывание строки методом рекурсии
    public static String flipString(String str) {
        if (str.length()==1) return str;
        return flipString(str.substring(1)) + str.charAt(0);
    }
    //повторение и замер перевертывания n раз в динамической памяти
    public static void repeatFlip (String str, int n) {
        long start = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                str = flipString(str);
            }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }

}
