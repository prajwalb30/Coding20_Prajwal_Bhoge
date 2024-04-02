import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements between the arrays: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : array2) {
            set2.add(num);
        }

        
        set1.retainAll(set2);

        
        int[] commonElements = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            commonElements[index++] = num;
        }

        return commonElements;
    }
}
