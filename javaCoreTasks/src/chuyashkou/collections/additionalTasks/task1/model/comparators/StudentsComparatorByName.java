package chuyashkou.collections.additionalTasks.task1.model.comparators;

import chuyashkou.collections.additionalTasks.task1.model.Student;

import java.util.Comparator;

public class StudentsComparatorByName implements Comparator <Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
