package uli.nick.learn.synthetics;

import java.lang.reflect.Method;

public class SyntheticMethodDemo {
    class NestedClass {
        private String nestedField;
    }

    public String getNestedField() {
        return new NestedClass().nestedField;
    }

    public void setNestedField(String nestedField) {
        new NestedClass().nestedField = nestedField;
    }

    public static void main(String[] args) {
        SyntheticMethodDemo sm = new SyntheticMethodDemo();
        sm.meth();
    }

    void meth() {
        NestedClass nc = new NestedClass();
        System.out.println(nc.getClass().getMethods().length);
        for (Method method : nc.getClass().getMethods()) {
            System.out.println(method);
        }
        System.out.println(nc.getClass().getEnclosingMethod());
    }
}
