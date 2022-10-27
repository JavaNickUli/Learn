package uli.nick.javarush.task.pro.task13.task1313;

public class StringsLinkedList {

    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.prev = last.prev == null ? first : last.prev;
        node.prev.next = node;
        last.prev = node;
        node.value = value;
    }

    public static class Node {

        private Node prev;
        private String value;
        private Node next;
    }
}
