package chuyashkou.lessonsOOP.student;

public class Aspirant extends Student {

    private String scienceWork;

    public Aspirant() {
    }

    public Aspirant(String firstname, String lastname, String group, double averageMark, String scienceWork) {
        super(firstname, lastname, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public void getScholarship() {
        if (super.getAverageMark() == 5) {
            System.out.println("Стипендия " + this.getFirstname() + " " + this.getLastname() + " = 180 рублей.");
        } else {
            System.out.println("Стипендия " + this.getFirstname() + " " + this.getLastname() + " = 200 рублей.");
        }
    }
}
