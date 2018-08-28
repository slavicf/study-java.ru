package study_java.lesson07;

import java.io.UnsupportedEncodingException;

/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 28.08.2018
 * <p>
 * УРОК J-7. ПРЕОБРАЗОВАНИЕ ТИПОВ В JAVA.
 * http://study-java.ru/uroki-java/urok-7-preobrazovanie-tipov-v-java/
 */
public class TypeConversion {

    public static void main(String[] args) {

        stringToByte();
        stringToShort();
        stringToInt();
        stringToLong();
        stringToFloat();
        stringToDouble();
        stringToBoolean();

        intToString();
        doubleToString();
        longToString();
        floatToString();
        charToString();
        charToInt();

        intToLong();
        intToFloat();
        longToInt();
        doubleToInt();
    }

    // String to byte
    public static void stringToByte() {
        System.out.println("\nString to byte");
//        C использованием конструктора
        try {
            Byte b1 = new Byte("10");
            System.out.println(b1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        С использованием метода valueOf класса Byte
        String str1 = "111";
        try {
            Byte b2 = Byte.valueOf(str1);
            System.out.println(b2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        С использованием метода parseByte класса Byte
        byte b = 0;
        String str2 = "100";
        try {
            b = Byte.parseByte(str2);
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        Перевод строки в массив байтов и обратно из массива байтов в строку
        String str3 = "20150";
        byte[] b3 = str3.getBytes();
        System.out.println(b3);
//        массив байтов переводим обратно в строку
        try {
            String s = new String(b3, "cp1251");
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    // String to short
    public static void stringToShort() {
        System.out.println("\nString to short");
//        C использованием конструктора
        try {
            Short s1 = new Short("68");
            System.out.println(s1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода valueOf класса Short
        String str1 = "59";
        try {
            Short s2 = Short.valueOf(str1);
            System.out.println(s2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода parseShort класса Short
        short s3 = 0;
        String str2 = "100";
        try {
            s3 = Short.parseShort(str2);
            System.out.println(s3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }

    // String to int
    public static void stringToInt() {
        System.out.println("\nString to int");
//        C использованием конструктора
        try {
            Integer i1 = new Integer("20349");
            System.out.println(i1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода valueOf класса Integer
        String str1 = "1451";
        try {
            Integer i2 = Integer.valueOf(str1);
            System.out.println(i2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода parseInt класса Integer
        int i3 = 0;
        String str2 = "102944";
        try {
            i3 = Integer.parseInt(str2);
            System.out.println(i3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }

    // String  to long
    public static void stringToLong() {
        System.out.println("\nString  to long");
//        C использованием конструктора
        try {
            Long l1 = new Long("11111111");
            System.out.println(l1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода valueOf класса Long
        String str1 = "222222222";
        try {
            Long l2 = Long.valueOf(str1);
            System.out.println(l2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода parseLong класса Long
        long l3 = 0;
        String str2 = "333333333";
        try {
            l3 = Long.parseLong(str2);
            System.out.println(l3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }

    // String to float
    public static void stringToFloat() {
        System.out.println("\nString to float");
//        С использованием конструктора
        try {
            Float f1 = new Float("123.5");
            System.out.println(f1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода valueOf класса Float
        String str1 = "3.1415";
        try {
            Float f2 = Float.valueOf(str1);
            System.out.println(f2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода parseFloat класса Float
        float f3 = 0;
        String str2 = "36.6";
        try {
            f3 = Float.parseFloat(str2);
            System.out.println(f3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }

    // String to double
    public static void stringToDouble() {
        System.out.println("\nString to double");
//        С использованием конструктора
        try {
            Double d1 = new Double("4.4e10");
            System.out.println(d1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода valueOf класса Double
        String str1 = "564.6e10";
        try {
            Double d2 = Double.valueOf(str1);
            System.out.println(d2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
//        C использованием метода parseDouble класса Double
        double d3 = 0;
        String str2 = "13.7e10";
        try {
            d3 = Double.parseDouble(str2);
            System.out.println(d3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }

    // String to boolean
    public static void stringToBoolean() {
        System.out.println("\nString to boolean");
//        Преобразование строки в логический тип 2мя способами. Обратите внимание, что строка не соответствующая true, будет преобразована в логическое значение false.
        String s1 = "True";
        String s2 = "yes";
        boolean bool1, bool2, boolean1, boolean2;

        //с использованием метода parseBoolean
        bool1 = Boolean.parseBoolean(s1);
        bool2 = Boolean.parseBoolean(s2);
        System.out.println(bool1);
        System.out.println(bool2);

        //c использованием метода valueOf
        boolean1 = Boolean.valueOf(s1);
        boolean2 = Boolean.valueOf(s2);
        System.out.println(boolean1);
        System.out.println(boolean2);
    }

    // int to String
    public static void intToString() {
        System.out.println("\n int to String");
        int i = 35;
        String str = Integer.toString(i);
        System.out.println(str);
    }

    // double to String
    public static void doubleToString() {
        System.out.println("\n double to String");
        double i = 32.4e10;
        String str = Double.toString(i);
        System.out.println(str);
    }

    // long to String
    public static void longToString() {
        System.out.println("\n long to String");
        long i = 3422222;
        String str = Long.toString(i);
        System.out.println(str);
    }

    // float to String
    public static void floatToString() {
        System.out.println("\n float to String");
        float i = 3.46f;
        String str = Float.toString(i);
        System.out.println(str);
    }

    // char to String
    public static void charToString() {
        System.out.println("\n char to String");
        char ch = 'S';

        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String str = "" + ch;
        System.out.println(str);

        //с использованием массива
        String fromChar = new String(new char[]{ch});
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);
    }

    // char to int
    public static void charToInt() {
        char ch = '9';

        // c использованием метода getNumericValue
        // класса Character
        int i1 = Character.getNumericValue(ch);
        System.out.println(i1);

        // c использованием метода digit класса Character
        int i2 = Character.digit(ch, 10);
        System.out.println(i2);
    }

    // int to long
    public static void intToLong() {
        System.out.println("\n int to long");
        int i = 2015;
        long l = (long) (i);
        System.out.println(l);
    }

    // int to float
    public static void intToFloat() {
        System.out.println("\n int to float");
        int i = 2015;
        float f = (float) (i);
        System.out.println(f);
    }

    // long to int
    public static void longToInt() {
        System.out.println("\n long to int");
        long l = 214748364;
        int i = (int) l;
        System.out.println(i);
    }

    // double to int
    public static void doubleToInt() {
        System.out.println("\n double to int");
        double d = 3.14;
        int i = (int) d;
        System.out.println(i);
    }
}
