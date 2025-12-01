package interfaces;

import org.junit.jupiter.api.function.Executable;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import java.Merger;

public interface ThrowableMergeTest {

    void runThrowableTest(Exception ex);

    default void assertExceptionThrown(List<Integer> A, List<Integer> B, Exception ex){
        Executable executable = () -> Merger.mergeSorted(A,B);
        Assertions.assertThrows(ex.getClass(), executable);
    }
}
