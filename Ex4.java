/*•	В переменной n хранится натуральное двузначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n (n – вводит пользователь).
 */

package IrelandUp;
import java.util.*;


public class Ex4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int j;
        int sum = 0;
        System.out.print("Ваше число  - ");
        for(j = scanner.nextInt(); j != 0; j /= 10)
        {
            sum = sum + (j % 10);
        }
        System.out.println("сумма цифр числа  равна "+sum);
        }
    }



