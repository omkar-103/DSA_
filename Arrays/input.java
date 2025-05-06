import java.util.*;


public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size as input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Take array elements as input
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
