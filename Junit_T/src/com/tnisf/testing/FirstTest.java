package com.tnisf.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @DisplayName("Sandesh")
    @Test
    void display() {
        System.out.print("Done!");
    }

    @Disabled // Skips this test
    @DisplayName("Sanshi")
    @RepeatedTest(4)
    void run() {
        System.out.print("DBIT!");
    }
}
