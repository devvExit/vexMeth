package vexmeth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
// import vexmeth.waveFunctions;

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
        btn1 = new JButton("tri");
        btn2 = new JButton("Sawtooth Wave");

        frame.add(btn1);
        frame.add(btn2);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 10));
        frame.setSize(250, 150);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("tri")) {
            try {
                wave("___________________________");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (ae.getActionCommand().equals("Sawtooth Wave")) {
            try {
                wave("sawtooth");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void wave(String a) throws InterruptedException {
        int speed = 7;
        String s = "___________________________";

        for (int i = 1; i < a.length(); i++) { // Forward
            System.out.println(a.substring(0, i) + "CORONA");
            TimeUnit.MILLISECONDS.sleep(speed);
        }

        for (int i = s.length(); i >= 2; i--) { // Backward
            System.out.println(a.substring(0, i) + "CORONA");
            TimeUnit.MILLISECONDS.sleep(speed);
        }
        wave(s);
    }
}