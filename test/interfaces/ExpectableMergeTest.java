package interfaces;

import java.Merger;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface ExpectableMergeTest {
    @Test
    void runExpectableTest();

    default void assertCorrectOrder(List<Integer> R){
        for (int i = 0; i < R.size(); i++){
            Assertions.assertTrue(i + 1 < R.size());
            Assertions.assertTrue(R.get(i) < R.get(i + 1));
        }
    }
}
