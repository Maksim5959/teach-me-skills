package chuyashkou.collections.additionalTasks.browser;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    private final List<String> history = new ArrayList<>();
    private int currentPosition = 0;

    public BrowserHistory(String homepage) {
        this.history.add(homepage);
    }

    public List<String> getHistory() {
        return history;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public String visit(String url) {
        this.history.add(currentPosition + 1, url);
        this.history.subList(currentPosition + 2, this.history.size()).clear();
        currentPosition++;
        return "null";
    }

    public String back(int steps) {
        if (currentPosition - steps > 0) {
            currentPosition -= steps;
        } else {
            currentPosition = 0;
        }
        return this.history.get(currentPosition);
    }

    public String forward(int steps) {
        if (currentPosition + steps < this.history.size()) {
            currentPosition += steps;
        } else {
            currentPosition = this.history.size() - 1;
        }
        return this.history.get(currentPosition);
    }
}
