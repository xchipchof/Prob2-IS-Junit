package java;

import java.util.List;
import java.util.ArrayList;


public class Merger {
    public static List<Integer> mergeSorted(List<Integer> A, List<Integer> B) throws IllegalArgumentException {

        // Check if list1 is sorted in ascending order and has no repeated items
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) >= A.get(i + 1)) {
                throw new IllegalArgumentException("List 1 is not strictly sorted in ascending order (contains duplicates or is unsorted).");
            }
        }

        // Check if list2 is sorted in ascending order and has no repeated items
        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) >= B.get(i + 1)) {
                throw new IllegalArgumentException("List 2 is not strictly sorted in ascending order (contains duplicates or is unsorted).");
            }
        }

        return getItems(A, B);

    }

    private static List<Integer> getItems(List<Integer> A, List<Integer> B) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < A.size() && j < B.size()) {
            int val1 = A.get(i);
            int val2 = B.get(j);

            if (val1 < val2) {
                mergedList.add(val1);
                i++;
            } else if (val2 < val1) {
                mergedList.add(val2);
                j++;
            } else {
                mergedList.add(val1);
                i++;
                j++;
            }
        }

        while (i < A.size()) {
            mergedList.add(A.get(i));
            i++;
        }

        while (j < B.size()) {
            mergedList.add(B.get(j));
            j++;
        }
        return mergedList;
    }
}
