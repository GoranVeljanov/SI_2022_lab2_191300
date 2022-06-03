import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatement() {
        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, () -> SILab2.function());
    }
    void everyBranch() {
        RuntimeException exception;
    }
}