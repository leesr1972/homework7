package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        String fullNameInBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameInBig);

        String fullNameWithJo = "Иванов Семён Семёнович";
        String fullNameWithoutJo = fullNameWithJo.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullNameWithoutJo);
    }
}
