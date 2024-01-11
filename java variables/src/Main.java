import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        String s;
        s = "s"; // a = "ваш текст"
        TimerTask task1 = new TimerTask() {
            public void run() {
                System.out.println(s); // тут выводиться
            }
        };
        String a;
        a = "a";
        TimerTask task2 = new TimerTask() {
            public void run() {
                System.out.println(a);
            }
        };
        String test;
        test = "test";
        TimerTask task3 = new TimerTask() {
            public void run() {
                System.out.println(test);
            }
        };
        timer.schedule(task1, 2000);    // таймер
        timer.schedule(task2, 4000);
        timer.schedule(task3, 6000);
    }
}

// мой дс iglobrix12