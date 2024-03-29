package ru.geekbrains.oop.lesson7.singleton;

public class Program {

    public static void main(String[] args) {

        //Settings settings1 = new Settings();
        //Settings settings2 = new Settings();

        Settings settings1 = Settings.getInstance();
        System.out.println(settings1.getParam2());
    }

}
