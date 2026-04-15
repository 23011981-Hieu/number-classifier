package com.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    void testStatementCoverage() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        NumberClassifier.classifyNumbers(new int[] { 1, 2, -1, 0 });

        String result = out.toString();

        assertTrue(result.contains("so duong le"));
        assertTrue(result.contains("so duong chan"));
        assertTrue(result.contains("so am"));
        assertTrue(result.contains("So 0"));
    }
}