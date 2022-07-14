package uli.nick.job4j.lessons.tracker.search;

import java.util.LinkedList;

/**
 * <p>2. Очередь с приоритетом на LinkedList [#41670 #311625]
 */

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}

// Каркас 2.:
//import java.util.LinkedList;
//
//public class PriorityQueue {
//    private LinkedList<Task> tasks = new LinkedList<>();
//
//    /**
//     * Метод должен вставлять в нужную позицию элемент.
//     * Позиция определяется по полю приоритет.
//     * Для вставки использовать add(int index, E value)
//     * @param task задача
//     */
//    public void put(Task task) {
//        int index = 0;
//        for (Task element : tasks) {
//
//        }
//        this.tasks.add(index, task);
//    }
//
//    public Task take() {
//        return tasks.poll();
//    }
//}
//.
