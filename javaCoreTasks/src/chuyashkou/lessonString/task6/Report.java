package chuyashkou.lessonString.task6;

public class Report {

    public static void generateReport(Employee employee) {
        System.out.printf("%-20s got %15.2f dollars.\n", employee.getFullName(), employee.getSalary());
    }
}
