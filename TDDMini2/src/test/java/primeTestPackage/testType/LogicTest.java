package primeTestPackage.testType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import prime.Prime;

/**
 * TestClass to check if prime calculations are functioning correctly
 * # count -> total amount of primes within boundaries
 * # sum -> total sum of all primes within boundaries
 * Tests performed with valid and invalid intervals
 */
public class LogicTest {

    /**
     * Valid boundaries
     *
     */

    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#validBoundaryArgs")
    @DisplayName("LogicTest testLogicValidBoundaryCount() | Values used -> {0}, {1} | expected : {2}")
    void testLogicValidBoundaryCount(int start, int end, int expectedCount, int expectedSum) {
        assertEquals(expectedCount, new Prime(start, end).getPrimes().size());
    }

    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#validBoundaryArgs")
    @DisplayName("LogicTest testLogicValidBoundarySum() | Values used -> {0}, {1} | expected : {3}")
    void testLogicValidBoundarySum(int start, int end, int expectedCount, int expectedSum) {
        assertEquals(expectedSum, new Prime(start, end).getPrimes().stream().reduce(0,Integer::sum));
    }

    /**
     * Invalid boundaries
     *
     */

    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#invalidBoundaryArgs")
    @DisplayName("LogicTest testLogicInvalidBoundaryCount() | Values used -> {0}, {1} | expected : {2}")
    void testLogicInvalidBoundaryCount(int start, int end, Arguments args) {
        assertEquals(args, new Prime(start, end).getPrimes());
    }

    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#invalidBoundaryArgs")
    @DisplayName("LogicTest testLogicInvalidBoundarySum() | Values used -> {0}, {1} | expected : {2}")
    void testLogicInvalidBoundarySum(int start, int end, Arguments args) {
        assertEquals(args, new Prime(start, end).getPrimes());
    }
}
