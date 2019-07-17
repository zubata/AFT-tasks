package Classwork.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Task1
//Написать метод.
//Метод должен выводить на экран ближайшее к 10 из двух введеных чисел, записанных в аргумент метода.
//Числа могут быть любого типа.
//Числа вводятся с клавиатуры.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double number1=Double.parseDouble(rd.readLine());
        double number2=Double.parseDouble(rd.readLine());
        rd.close();
        if((10-number1)>(10-number2)) {
            System.out.println("Второе число ближе "+number2);
        }
        else System.out.println("Первое число ближе "+number1);
    }
}
