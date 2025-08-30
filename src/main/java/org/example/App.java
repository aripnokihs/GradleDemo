package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("App can serve as a driver");

        Lib l = new Lib();
        System.out.println("returnTrue() returned " + l.returnTrue());
    }
}