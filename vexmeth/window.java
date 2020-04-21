package vexmeth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class window {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new A();
            }
        });
    }
}

class A implements ActionListener {
    JFrame frame;
    JButton btn1, btn2;

    A() {
        frame = new JFrame();
        btn1 = new JButton("Triangle Wave");
        btn2 = new JButton("Sawtooth Wave");

        frame.add(btn1);
        frame.add(btn2);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 10));
        frame.setSize(250, 150);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        if (ae.getActionCommand().equals("Triangle Wave")) {
            wave("triangle");
        }
        if (ae.getActionCommand().equals("Sawtooth Wave")) {
            wave("sawtooth");
        }
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