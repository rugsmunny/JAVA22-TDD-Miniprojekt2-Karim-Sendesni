package primeTestPackage.testType;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import prime.Prime;

import java.io.PrintStream;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static primeTestPackage.testModel.Prime.*;

/**
 * TestClass to check if prime printOuts are functioning correctly
 * Tests performed with valid and invalid intervals
 */

public class OutputTest {

    @BeforeEach
    public void setUp() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        outputStreamCaptor.reset();
        System.setOut(originalOut);
    }

    /**
     * Valid boundaries
     */

    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#validBoundaryArgs")
    @DisplayName("OutputTest testPrintValidBoundary() | Values used -> {0}, {1} | expected : correct msg")
    void testPrintValidBoundary(int start, int end, int expectedCount, int expectedSum) {
        new Prime(start, end);
        assertEquals(format(outPrintMsg.get("count") + outPrintMsg.get("sum"), expectedCount,start, end,  expectedSum), outputStreamCaptor.toString().trim());
    }

    /**
     * Invalid boundaries
     */

    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#invalidBoundaryArgs")
    @DisplayName("OutputTest testPrintInvalidBoundary() | Values used -> {0}, {1} | expected : error msg")
    void testPrintInvalidBoundary(int start, int end) {
        new Prime(start, end);
        assertEquals(outPrintMsg.get("error"), outputStreamCaptor.toString().trim());
    }
}

