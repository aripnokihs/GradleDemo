package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void someLibraryMethodReturnsTrue() {
        Lib classUnderTest = new Lib();
        assertTrue(classUnderTest.returnTrue(), "returnTrue() should return true");
    }
}
