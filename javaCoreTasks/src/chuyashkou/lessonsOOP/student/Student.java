package chuyashkou.lessonsOOP.student;

public class Student {

    private String firstname;
    private String lastname;
    private String group;
    private double averageMark;

    public Student() {
    }

    public Student(String firstname, String lastname, String group, double averageMark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void getScholarship() {
        if (this.averageMark == 5) {
            System.out.println("Стипендия " + firstname + " " + lastname + " = 100 рублей.");
        } else {
            System.out.println("Стипендия " + firstname + " " + lastname + " = 80 рублей.");
        }
    }
}
