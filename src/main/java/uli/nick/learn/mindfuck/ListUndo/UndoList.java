package uli.nick.learn.mindfuck.ListUndo;

import java.util.LinkedList;

public class UndoList<E> extends LinkedList<E> implements UndoableList<E> {

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean add(E o) {
        super.add(o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
         super.remove(o);
        return false;
    }

    @Override
    public void undo() {

    }
}
