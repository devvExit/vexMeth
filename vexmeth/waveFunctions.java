package vexmeth;

import java.util.concurrent.TimeUnit;

public class waveFunctions {

    public static void main(String[] args) throws InterruptedException {
        String s = "__________________________________";
        int speed = 2;
        triangleWave(s, speed);
    }

    public static void triangleWave(String s, int speed) throws InterruptedException {

        for (int i = 1; i < s.length(); i++) { // Forward
            System.out.println(s.substring(0, i) + "CORONA");
            TimeUnit.MILLISECONDS.sleep(speed);
        }

        for (int i = s.length(); i >= 2; i--) { // Backward
            System.out.println(s.substring(0, i) + "CORONA");
            TimeUnit.MILLISECONDS.sleep(speed);
        }
        triangleWave(s, speed);
    }

}