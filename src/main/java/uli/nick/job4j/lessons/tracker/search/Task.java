package uli.nick.job4j.lessons.tracker.search;

/**
 * <p>2. Очередь с приоритетом на LinkedList [#41670 #311625]
 */

public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
