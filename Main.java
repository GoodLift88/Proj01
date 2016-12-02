/*	Создать программу, проверяющую и сообщающую на экран,
является ли целое число, записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 */


package IrelandUp;

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите целое число ");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_");
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     int number = Integer.parseInt(read.readLine());
        if (number%2==0)
            System.out.println("Четное");
        else
            System.out.println("Нечетное ");



    }

}
