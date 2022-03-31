package chuyashkou.lessonsOOP.student;

public class Aspirant extends Student {

    private String firstname;
    private String lastname;
    private String group;
    private double averageMark;

    public Aspirant() {
    }

    public Aspirant(String firstname, String lastname, String group, double averageMark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.averageMark = averageMark;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public void getScholarship() {
        if (this.averageMark == 5) {
            System.out.println("Стипендия " + firstname + " " + lastname + " = 200 рублей.");
        } else {
            System.out.println("Стипендия " + firstname + " " + lastname + " = 180 рублей.");
        }
    }
}
