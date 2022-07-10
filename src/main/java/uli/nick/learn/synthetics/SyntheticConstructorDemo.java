package uli.nick.learn.synthetics;

public class SyntheticConstructorDemo {
    private NestedClass nestedClass = new NestedClass();

    class NestedClass {
        private NestedClass() {

        }
    }
}
