/*•	В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).
  */
package IrelandUp;


import java.util.Scanner;

/**
 * Created by Lekter on 29.11.2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение для катета 1 ");
        int a = scan.nextInt();
        System.out.println("Введите значение для катета 2");
        int b = scan.nextInt();
        System.out.println("Площадь треугольника равна " + square(a,b));
        System.out.println("Периметр треугольника равен "+ perimeter(a,b));
    }
    private static int square(int a, int b)
    {
       return (a*b)/2 ;
    }
    private static double perimeter(double a, double b)
    {
        return Math.sqrt(a*a+b*b)+(a+b);//решил оставить в таком виде при компиляции результат правильный
    }
}