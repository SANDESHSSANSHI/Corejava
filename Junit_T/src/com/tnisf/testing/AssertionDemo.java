package com.tnisf.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AssertionDemo {

    @Test
    public void checkAssertEquals() {
        int r = 1;
        int e = 1;
        assertEquals(e, r);  // This will pass because 1 equals 1
    }

    @Test
    public void testCheckAssertFalse() {
        assertFalse("hello".contains("S"));  // This will pass because "hello" does not contain "S"
    }

    @Test
    public void checkAssertNull() {
        String str = null;
        assertNull(str);  // This will pass because str is null
    }

    @Test
    public void checkAssertNotNull() {
        String str = "Hello, World!";
        assertNotNull(str);  // This will pass because str is not null
    }
}
