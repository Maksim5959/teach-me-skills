package chuyashkou.lessonsOOP.student;

public class StudentApp {

    public static void main(String[] args) {

        Student aspirant = new Aspirant("Ivan", "Ivanov", "C15", 5.0);
        Student student = new Student("Igor", "Ivanov", "C15", 4.9);

        Student[] students = {aspirant, student};

        for (Student student1 : students) {
            student1.getScholarship();
        }
    }
}
