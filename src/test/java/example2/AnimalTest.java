package example2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AnimalTest {

    @ParameterizedTest
    public void changePrimitive(int toChange) {
        String fds = "fds";
        assertEquals("fds", fds);
    }
}