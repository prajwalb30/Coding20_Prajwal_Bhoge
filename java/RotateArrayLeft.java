import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));

        rotateLeft(array);

        System.out.println("Array after left rotation: " + Arrays.toString(array));
    }

    public static void rotateLeft(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; 
        }
        array[array.length - 1] = firstElement; 
    }
}
