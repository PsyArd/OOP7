package ru.geekbrains.oop.lesson7.observer;

public class Vacansy {
    private String nameVacancy;
    private boolean isStudent;
    private double Salary;

    public Vacansy(String nameVacancy, boolean isStudent, double salary) {
        this.nameVacancy = nameVacancy;
        this.isStudent = isStudent;
        Salary = salary;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
