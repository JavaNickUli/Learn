package uli.nick.learn.synthetics;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SyntheticMethodDemoTest {

    @Test
    public void givenSyntheticMethodWhenIsSyntheticThenTrue() {
        Method[] methods = SyntheticMethodDemo.NestedClass.class.getDeclaredMethods();
        assertEquals(2, methods.length, "This class should contain only two methods");

        for (Method m : methods) {
            System.out.println("Method: " + m.getName() + ", isSynthetic: " + m.isSynthetic());
            assertTrue(m.isSynthetic(), "All the methods of this class should be synthetic");
        }
    }
}
