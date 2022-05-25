package chuyashkou.collections.additionalTasks.browser;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> report = new ArrayList<>();
        BrowserHistory browserHistory = new BrowserHistory("google.com");
        report.add(browserHistory.visit("linkedin.com"));
        report.add(browserHistory.visit("youtube.com"));
        report.add(browserHistory.visit("mail.ru"));
        report.add(browserHistory.visit("github.com"));
        report.add(browserHistory.back(8));
        report.add(browserHistory.forward(1));
        report.add(browserHistory.visit("oracle.com"));
        report.add(browserHistory.forward(5));
        System.out.println(browserHistory.getCurrentPosition());
        System.out.println(browserHistory.getHistory());
        System.out.println(report);
    }
}
