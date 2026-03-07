public class DataTypeInspector {
    public static void main(String[] args) {

        byte byteValue = 100;
        short shortValue = 20000;
        int intValue = 150000;
        long longValue = 10000000000L;

        float floatValue = 5.75f;
        double doubleValue = 19.99;

        char charValue = 'A';
        boolean booleanValue = true;

        
        System.out.println("Java Primitive Data Types Demonstration:");
        System.out.println("----------------------------------------");

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);

        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}