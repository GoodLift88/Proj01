/*Создать класс, который будет хранить в одной целочисленной переменной несколько
значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы
получения и добавления параметров отдельно.
 */

package IrelandUp;


public class Ex8 {
    static long allNum = 40701701920L;

    public static void main(String[] args) {
        System.out.println(Year(allNum));
        System.out.println(Growth(allNum));
        System.out.println(Weight(allNum));
        System.out.println(Age(allNum));

    }

    protected static long Year(long allNum) {
        return allNum % 100000;

    }
    protected static long Growth(long allNum)
    {
        return ((allNum % 10000000)-Year(allNum))/10000 ;
    }
    protected static long Weight(long allNum)
    {
        return (allNum%1000000000-allNum % 10000000)/10000000;
    }
    protected static long Age(long allNum)
    {
        return (allNum-allNum%1000000000)/1000000000;
    }
}

