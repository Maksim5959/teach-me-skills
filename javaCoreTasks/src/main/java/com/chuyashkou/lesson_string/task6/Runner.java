package com.chuyashkou.lesson_string.task6;

/*6. Отчет о сотрудниках, часть 1
Создать класс Employee, у которого есть переменные класса - fullname, salary.
Создать массив содержащий несколько объектов этого типа.
Создать класс Report  со статическим методом generateReport, в котором выводится информация о зарплате всех сотрудников.
Используйте форматирование строк. Пусть salary будет выровнено по правому краю,
десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.*/

public class Runner {

    public static void main(String[] args) {

        Employee[] employees = {new Employee("Ivan Ivanov", 200.158),
                new Employee("Petr Petrov", 55500.502),
                new Employee("Aleksey Alekseev", 3515100.208)};

        for (Employee employee : employees) {
            Report.generateReport(employee);
        }
    }
}
