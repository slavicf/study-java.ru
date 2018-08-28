package study_java.lesson05;

/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 27.08.2018
 * <p>
 * УРОК J-5. СОЗДАНИЕ КЛАССА И ОБРАЩЕНИЕ К НЕМУ В JAVA
 * http://study-java.ru/uroki-java/urok-5-sozdanie-i-vyzov-klassa-v-java/
 */
public class Cat {

    private int weight;     // вес кота
    private String name;    // имя кота
    private String color;   // окрас кота

    //кот ест
    public void eat() {
        System.out.println("Eating...\n");
    }

    //кот спит
    public void sleep() {
        System.out.println("Sleeping zz-z-z-z...\n");
    }

    //кот говорит
    public String speak(String words) {
        String phrase = words + "...mauu...\n";
        return phrase;
    }
}
