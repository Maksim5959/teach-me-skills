package chuyashkou.collections.additionalTasks.task1.model.comparators;

import chuyashkou.collections.additionalTasks.task1.model.Student;

import java.util.Comparator;

public class StudentsComparatorByAge implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
