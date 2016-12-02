/*
•	В три переменные a, b и c записаны три вещественных числа.
Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax^2+bx+c=0,
либо сообщать, что корней нет (a, b и c – вводит пользователь).
 */

package IrelandUp;


import java.util.Scanner;

public class Ex5 {

    public static void main(String [] args) {
        System.out.println("Введите 3 вещественных числа");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double b1=b-2*b;
        if(findX(a, b, c) > 0)
        {
            System.out.println("Уравнение имеет 2 различных вещественных корня ");
            System.out.println("X1=" + ((b1 + findX(a, b, c)) / (2 * a)) + " X2=" + ((b1 - findX(a, b, c)) / (2 * a)));
        }
        else if (findX(a,b,c)==0)
        {
            System.out.println("Уравнение имеет 2 одинаковых  вещественный корня ");
            System.out.println("X1=" + ((b1 + findX(a, b, c)) / (2 * a)) + " X2=" + ((b1 - findX(a, b, c)) / (2 * a)));
        }
        else
            System.out.println("Уравнене не имеет вещественных корней ");
    }
    protected static double findX(double a, double b, double c)
    {
        return Math.sqrt((b*b)-(4*a*c));
    }

}

