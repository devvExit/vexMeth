package vexmeth;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.awt.Desktop;

public class alpha {
    private static String[] args;

    public static void main(String[] args) throws InterruptedException, IOException {
        bootup();
    }

    //////////
    public static void waiter(int n) throws InterruptedException, IOException {
        cls(args);
        System.out.println("\t\t   LOADING\n\t\t PLEASE WAIT");
        for (int i = 0; i < n; i++) {
            TimeUnit.MILLISECONDS.sleep(50);
            System.out.print("▓");
        }
        cls(args);
    }

    public static void sleeper(int n) throws InterruptedException, IOException {
        TimeUnit.MILLISECONDS.sleep(n);
    }

    public static void cls(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void welcome(String[] args) throws InterruptedException, IOException {
        System.out.println(
                "\n        ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗ \n        ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗\n        ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║\n        ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║\n        ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝\n         ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝ \n                                                                                            \n         █████╗ ██╗     ██████╗ ██╗  ██╗ █████╗         ██╗ █████╗ ██╗   ██╗ █████╗         \n        ██╔══██╗██║     ██╔══██╗██║  ██║██╔══██╗        ██║██╔══██╗██║   ██║██╔══██╗        \n        ███████║██║     ██████╔╝███████║███████║        ██║███████║██║   ██║███████║        \n        ██╔══██║██║     ██╔═══╝ ██╔══██║██╔══██║   ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║        \n        ██║  ██║███████╗██║     ██║  ██║██║  ██║██╗╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║        \n        ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝        ");
    }

    public static void bootup() throws InterruptedException, IOException {
        waiter(45);
        cls(args);
        welcome(args);
        TimeUnit.MILLISECONDS.sleep(3000);
        cls(args);
        mainMenu();
    }

    public static void devBootup() throws InterruptedException, IOException {
        waiter(0);
        cls(args);
        welcome(args);
        TimeUnit.MILLISECONDS.sleep(0);
        cls(args);
        mainMenu();
    }

    public static void mainMenu() throws InterruptedException, IOException {
        Scanner in = new Scanner(System.in);
        Scanner enter = new Scanner(System.in);
        final int i = 20;
        String choiceentry;
        do {
            System.out.println("                                                                 ");
            sleeper(i);
            System.out.println("                                                #1               ");
            sleeper(i);
            System.out.println("                                        RUN HUMANTEST.JAVA       ");
            sleeper(i);
            System.out.println("                                                                 ");
            sleeper(i);
            System.out.println("                                                #2               ");
            sleeper(i);
            System.out.println("                                              README             ");
            sleeper(i);
            System.out.println("                                                                 ");
            sleeper(i);
            System.out.println("                                                #3               ");
            sleeper(i);
            System.out.println("                                           EXIT PROGRAM          ");
            sleeper(i);
            System.out.println("                                                                 ");
            sleeper(i);
            System.out.print("                                                 ");
            choiceentry = in.next();

            switch (choiceentry) {
                case "1":
                    new ProcessBuilder("cmd", "/c", "java humanTest.java").inheritIO().start().waitFor();
                    System.out.println(
                            "\n\n____________________________\n\nFOR NOW THIS IS ONLY RUNNING HUMANTEST.JAVA AS A TEST.\nPress enter to continue...");
                    enter.nextLine();
                    cls(args);
                    break;
                case "2":
                    Desktop.getDesktop().open(new File("vexmeth/readme.txt"));
                    cls(args);
                    break;
                case "3":
                    cls(args);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 3.");
            }
        } while (!choiceentry.equals("3"));
        in.close();
        enter.close();
    }
}