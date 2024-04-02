import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

    
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }
}
