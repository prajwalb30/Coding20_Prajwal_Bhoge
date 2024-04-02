import java.util.Arrays;

public class RotateArrayLeftK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate left

        System.out.println("Original array: " + Arrays.toString(array));

        rotateLeftK(array, k);

        System.out.println("Array after rotating " + k + " positions left: " + Arrays.toString(array));
    }

    public static void rotateLeftK(int[] array, int k) {
        if (array == null || array.length <= 1) {
            return;
        }

        int n = array.length;
        k = k % n; // Ensure k is within the array length

        reverseArray(array, 0, k - 1);
        reverseArray(array, k, n - 1);
        reverseArray(array, 0, n - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
