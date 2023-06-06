package ru.veldergard.engine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EngineLibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        long result = Math.round(EngineLibrary.calculateWorkingVolume(5, 5));
        long expectedResult = Math.round(392.699);
        assertEquals(result, expectedResult);
    }
}
