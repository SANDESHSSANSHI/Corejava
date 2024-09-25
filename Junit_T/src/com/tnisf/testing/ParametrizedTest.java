package com.tnisf.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Sandesh", "Ronit", "Sandeep", "BB"})
    void startsWithS(String str) {
        assertTrue(str.startsWith("S"));  // Checks if the string starts with "S"
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sandesh", "Ronit", "Sandeep", "BB"})
    void endsWithT(String str) {
        assertTrue(str.endsWith("t"));  // Checks if the string ends with "t"
    }
}
