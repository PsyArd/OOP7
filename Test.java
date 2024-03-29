package ru.geekbrains.oop.lesson7.factory;

public class Test extends Employee {
    private Test(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    public static Test create(String name, String surName, double salary){

        if (name == null || name.length() < 3)
            throw new RuntimeException("Имя тестировщика указано некорректно.");

        if (salary <= 0)
            throw new RuntimeException("Уровень заработной платы указан некорректно.");

        return new Test(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Тестировщик; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surName, name, salary);
    }
}
