/*
•	Создать класс Dog, который будет содержать 2 поля name и says.
В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”).
И распечатать поля объектов.
 */

package IrelandUp;

public class Dog {
    public static void main(String[]args){
        Dog dog1 = new Dog("Spot","Ruff");
        Dog dog2 = new Dog ("Scruffy","Wurf");
        System.out.println(dog1.name+" "+dog1.says );
        System.out.println(dog2.name+" "+dog2.says);
    }


    protected String name;
    protected String says;
    protected Dog(String name, String says)
    {
     this.name=name;
        this.says=says;
    }

}

