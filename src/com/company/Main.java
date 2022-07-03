package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет! Введите строку:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MyString myString = new MyString(reader.readLine());
        System.out.println(myString.flipString());
        myString.repeatFlipString(1000);
        myString.repeatFlipString(10000);
        myString.repeatFlipString(100000);
    }


}
