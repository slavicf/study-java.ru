package study_java.lesson08;

/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 23.08.2018
 * <p>
 * УРОК J-8. JAVA ЛОГИЧЕСКИЕ И УСЛОВНЫЕ ОПЕРАТОРЫ (IF, IF-ELSE И SWITCH)
 * http://study-java.ru/uroki-java/urok-8-java-logicheskye-i-uslovnye-operatory/
 */
public class Lesson08 {

    static int a = 3;
    static int b = 8;
    static int c = 1;
    static int d = 8;
    static int e = 9;

    static String name1 = "John";
    static String name2 = "John";

    static int month = 12;

    public static void main(String[] args) {
        least();
        greatest();
        leastGreatest();
        names();
        season();
    }

    public static void least() {    // Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
        int result = 0;

        if (a < b && a < c && a < d) result = a;
        if (b < a && b < c && b < d) result = b;
        if (c < a && c < b && c < d) result = c;
        if (d < a && d < b && d < c) result = d;

        System.out.println("1. Наименьшее число: " + result);
    }

    public static void greatest() { // Вывести на консоль количество максимальных чисел среди этих четырех.
        int counter = 0;

        if (a >= b && a >= c && a >= d) counter++;
        if (b >= a && b >= c && b >= d) counter++;
        if (c >= a && c >= b && c >= d) counter++;
        if (d >= a && d >= b && d >= c) counter++;

        System.out.println("2. Количество наибольших чисел: " + counter);
    }

    private static void leastGreatest() {   // Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
        int result1 = 0;
        int result2 = 0;

        if (a < b && a < c && a < d && a < e) result1 = a;
        if (b < a && b < c && b < d && b < e) result1 = b;
        if (c < a && c < b && c < d && c < e) result1 = c;
        if (d < a && d < b && d < c && d < e) result1 = d;
        if (e < a && e < b && e < c && e < d) result1 = e;

        if (a > b && a > c && a > d && a > e) result2 = a;
        if (b > a && b > c && b > d && b > e) result2 = b;
        if (c > a && c > b && c > d && c > e) result2 = c;
        if (d > a && d > b && d > c && d > e) result2 = d;
        if (e > a && e > b && e > c && e > d) result2 = e;

        System.out.println("3. Наименьшее число: " + result1 + ". Наибольшее число: " + result2);

    }

    public static void names() {    // Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
        System.out.println("4. " + ((name1.equals(name2)) ? "Люди являются тезками" : "Люди не являются тезками"));
    }

    private static void season() {  // Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        String result = "";

        if (month > 11 || month < 3) result = "Зима";
        if (month > 2 && month < 6) result = "Весна";
        if (month > 5 && month < 9) result = "Лето";
        if (month > 8 && month < 12) result = "Осень";

        System.out.println("5. " + result);
    }

}
