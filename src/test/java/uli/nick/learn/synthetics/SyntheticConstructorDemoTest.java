package uli.nick.learn.synthetics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SyntheticConstructorDemoTest {

    @Test
    public void givenSyntheticConstructorWhenIsSyntheticThenTrue() {
        int syntheticConstructors = 0;
        Constructor<?>[] constructors = SyntheticConstructorDemo.NestedClass
                .class.getDeclaredConstructors();
        Assertions.assertEquals(1, constructors.length,
                "This class should contain only two constructors");

        for (Constructor<?> c : constructors) {
            System.out.println("Constructor: " + c.getName() + ", isSynthetic: " + c.isSynthetic());

            if (c.isSynthetic()) {
                syntheticConstructors++;
            }
        }

        assertEquals(0, syntheticConstructors);
    }
}
