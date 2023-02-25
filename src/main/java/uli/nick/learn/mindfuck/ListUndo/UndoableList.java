package uli.nick.learn.mindfuck.ListUndo;

public interface UndoableList<E> {

    int size();

    boolean add(E e);

    boolean remove(Object o);

    void undo();
}
