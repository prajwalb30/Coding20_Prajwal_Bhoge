import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number in the array is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int totalSum = n * (n + 1) / 2; 

        int arraySum = Arrays.stream(array).sum(); 

        return totalSum - arraySum; 
    }
}
