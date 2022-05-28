package com.chuyashkou.lesson_string;

/*Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию,
оценку и название предмета в качестве параметров. Выделить под фамилию 15 символов, под оценку 3 символа,
под предмет – 10.
Пример вывода:
Студент Иванов       получил  5        по Математике
Студент Петрова      получил  4        по Физике
Студент Сидорова     получил  3        по Программированию*/

public class Task5 {

    public static void main(String[] args) {
        studentsGradesFormatter("Петрова", 5, "Математике");
        studentsGradesFormatter("Сидоров", 10, "Физике");
        studentsGradesFormatter("Муссугаллиев", 10, "Астрономии");
    }

    private static void studentsGradesFormatter(String lastname, int grade, String subject) {
        System.out.printf("Студент %-15s получил %-3d по %-15s\n", lastname, grade, subject);
    }
}
