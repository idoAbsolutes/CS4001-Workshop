public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();

        System.out.println("byte: " + obj.b);
        System.out.println("short: " + obj.s);
        System.out.println("int: " + obj.i);
        System.out.println("long: " + obj.l);
        System.out.println("float: " + obj.f);
        System.out.println("double: " + obj.d);
        System.out.println("char: " + obj.c);
        System.out.println("boolean: " + obj.bool);
    }
}

/*
Member variables get default values automatically.
Local variables must be initialized before use, otherwise the program will not compile.
*/