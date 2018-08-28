package study_java.lesson05;

/**
 * Created by Intellij IDEA.
 * User: Jaroslav Frunt
 * Date: 27.08.2018
 */
public class Main {

    public static void main(String[] args) {
        Cat ourCat = new Cat();
        ourCat.eat();
        ourCat.sleep();
        String say = ourCat.speak("Play with me");
        System.out.println(say);
    }
}
