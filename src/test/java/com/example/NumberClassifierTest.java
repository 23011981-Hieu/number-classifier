package com.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    void statementCoverageTest() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        NumberClassifier.classifyNumbers(new int[] { 1, 2, -1, 0 });

        String result = out.toString();

        // Kiểm tra từng statement đã chạy
        assertTrue(result.contains("so duong le")); // 1
        assertTrue(result.contains("so duong chan")); // 2
        assertTrue(result.contains("so am")); // 3
        assertTrue(result.contains("So 0")); // 4
    }

    @Test
    void branchCoverageTest() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        NumberClassifier.classifyNumbers(new int[] { 2, 3, -5, 0, 4, 7 });

        String result = out.toString();

        assertTrue(result.contains("so duong chan"));
        assertTrue(result.contains("so duong le"));
        assertTrue(result.contains("so am"));
        assertTrue(result.contains("So 0"));
    }
}