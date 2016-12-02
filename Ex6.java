package IrelandUp;


public class Ex6 {

    public static void main(String[] args) {
        Obj obj = new Obj();
        System.out.println(obj.i);
        System.out.println(obj.c);

    }

    private static class Obj
    {

        int i;
        char c;
    }
}