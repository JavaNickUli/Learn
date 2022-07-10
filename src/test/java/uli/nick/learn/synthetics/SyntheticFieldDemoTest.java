package uli.nick.learn.synthetics;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SyntheticFieldDemoTest {

    @Test
    public void givenSyntheticFieldWhenIsSyntheticThenTrue() {
        Field[] fields = SyntheticFieldDemo.NestedClass.class.getDeclaredFields();
        assertEquals(1, fields.length,
                "This class should contain only one field");

        for (Field f : fields) {
            System.out.printf("Field: %s, isSynthetic: %s", f.getName(), f.isSynthetic());
            assertTrue(f.isSynthetic(),
                    "All the fields of this class should be synthetic");
        }
    }
}
