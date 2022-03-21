package ru.skypro;

public class Main {

    public static void main(String[] args) {
    task3();
    }

    public static void task1(){
        String firstName = "Дмитрий";
        String middleName = "Сергеевич";
        String lastName = "Солдатов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        String firstName = "Дмитрий";
        String middleName = "Сергеевич";
        String lastName = "Солдатов";
        String fullName = firstName + " " + middleName + " " + lastName;
        String fullName1 = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullName1);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace('ё', 'е');
        System.out.println(fullName1);
    }
}

