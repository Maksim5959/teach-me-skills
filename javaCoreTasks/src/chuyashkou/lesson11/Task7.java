package chuyashkou.lesson11;

/*4. Отчет о сотрудниках,
Добавить метод в класс Employee (chuyashkou.lessonString.Task6.Employee),
который будет записывать отчет в файл.
Используем класс PrintWriter.*/

import chuyashkou.lessonString.task6.Employee;

public class Task7 {

    public static void main(String[] args) {

        Employee[] employees = {new Employee("Ivan Ivanov", 200.158),
                new Employee("Petr Petrov", 55500.502),
                new Employee("Aleksey Alekseev", 3515100.208)};

        for (Employee employee : employees) {
            employee.addReportToFile("files/fileTask7.txt");
        }
    }
}
