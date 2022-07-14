package uli.nick.job4j.lessons.tracker.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class PriorityQueueTest {

    @Test
    void whenPutPriority5n1n3ThenPriority1n3n5() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));

        String actual = queue.take().getDesc();
        then(actual).isEqualTo("urgent");

        actual = queue.take().getDesc();
        then(actual).isEqualTo("middle");

        actual = queue.take().getDesc();
        then(actual).isEqualTo("low");
    }

    @Test
    void whenTakeThenReturnAndDelete() {
        PriorityQueue queue = new PriorityQueue();
        Task actual = queue.take();
        then(actual).isNull();

        queue.put(new Task("low", 5));
        actual = queue.take();
        then(actual.getDesc()).isEqualTo("low");

        actual = queue.take();
        then(actual).isNull();
    }
}
