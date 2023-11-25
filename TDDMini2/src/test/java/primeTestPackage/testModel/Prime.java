package primeTestPackage.testModel;

import org.junit.jupiter.params.provider.Arguments;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.stream.Stream;



public class Prime {

    public static PrintStream originalOut = System.out;
    public static ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public static HashMap<String, String> outPrintMsg = new HashMap<>();

    static {
        outPrintMsg.put("error", "Hoppsan, fel intervall angivet!");
        outPrintMsg.put("count", "Hej, det finns %d primtal mellan %d och %d!");
        outPrintMsg.put("sum", "Och den totala summan av dessa primtal är %d");
    }


    // Arguments { start, end, expectedCount, expectedSum }
    public static Stream<Arguments> validBoundaryArgs() {
        return Stream.of(
                Arguments.of(0, 1000, 168, 76127),
                Arguments.of(500, 700, 30, 18076),
                Arguments.of(5, 499, 93, 21531)
        );
    }
    // Arguments { start, end, expected }
    public static Stream<Arguments> invalidBoundaryArgs() {
        return Stream.of(
                Arguments.of(-100, 1, null),
                Arguments.of(1001, 1100, null)
        );
    }

    // Arguments { start, end, expected }
    public static Stream<Arguments> invalidDataTypesArgs() {
        return Stream.of(
                Arguments.of(0.1, 99.99, null),
                Arguments.of("0", 1000, null),
                Arguments.of(0, "1000", null)
        );
    }

    public static Stream<Arguments> nullArgs() {
        return Stream.of(
                Arguments.of(0, null, null),
                Arguments.of(null, 1000, null),
                Arguments.of(null, null, null)
        );
    }
}




























