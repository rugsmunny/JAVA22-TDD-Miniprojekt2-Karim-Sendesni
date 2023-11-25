package primeTestPackage.testType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import prime.Prime;

/**
 * TestClass to check if constructor is functioning correctly
 * Tests performed with valid and invalid intervals
 */
public class ConstructorTest {

    /**
     * Valid boundaries
     */
    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#validBoundaryArgs")
    @DisplayName("ConstructorTest : Valid Boundary | Values used -> {0}, {1} | expected : !null")
    void testConstructorValidBoundary(int start, int end) {
        Prime p = new Prime(start, end);
        assertNotNull(p);
        assertNotNull(p.getPrimes());
    }

    /**
     * Invalid boundaries
     */
    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#invalidBoundaryArgs")
    @DisplayName("ConstructorTest : Invalid Boundary | Values used -> {0}, {1} | expected : null")
    void testConstructorInvalidBoundary(int start, int end) {
        assertNull(new Prime(start, end).getPrimes());
    }

    /*@ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#invalidDataTypesArgs")
    @DisplayName("ConstructorTest : Invalid DataTypes | Values used -> {0}, {1} | expected : null")
    void testConstructorInvalidDataTypes(int start, int end) {
        assertNull(new Prime(start, end).getPrimes());
    }

    @ParameterizedTest
    @MethodSource("primeTestPackage.testModel.Prime#nullArgs")
    @DisplayName("ConstructorTest : NullArgs | Values used -> {0}, {1} | expected : null")
    void testConstructorNullArgs(int start, int end) {
        assertNull(new Prime(start, end).getPrimes());
    }*/
}
