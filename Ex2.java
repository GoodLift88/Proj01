/*	Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 2 числа ");
        String s = "Ближайшее к десяти число ";
        double number1 = Double.parseDouble(read.readLine());
        double number2 = Double.parseDouble(read.readLine());
        System.out.println(number1 - 10 > number2 - 10 ? s+ number1 : s+ number2);

    }
}
