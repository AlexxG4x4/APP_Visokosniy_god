package ru.geekbrains.visokosniy_god;

import java.util.Scanner;
import java.util.SortedMap;

public class main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println ("Введите год");
        int input_year = scanner.nextInt();

        if (input_year < 0) {
            System.out.println("Такого года не существует");
        }
        if ((input_year % 400 ==0)||(input_year % 100 != 0) && (input_year % 4 == 0)){
            System.out.println ("Год високосный");
        }
        else{
            System.out.println ("Год не високосный");
        }
        //String test = (input_year % 400 == 0)||(input_year % 100 != 0) && (input_year % 4 == 0) ? "Високосный год" : "Не високосный год";
        //System.out.println(test);
        scanner.close();
    }
}