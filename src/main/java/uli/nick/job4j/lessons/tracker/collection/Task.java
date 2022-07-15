package uli.nick.job4j.lessons.tracker.collection;

/**
 * <p>1. Уникальные задачи. [#212653 #312240]
 */

public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
