import java.util.Arrays;
import java.util.Scanner;

public class arraymerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of both arrays
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        // Input elements for arr1
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input elements for arr2
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge the arrays
        int[] merged = new int[size * 2];
        for (int i = 0; i < size; i++) {
            merged[i] = arr1[i];
            merged[i + size] = arr2[i];
        }

        // Sort the merged array
        Arrays.sort(merged);

        // Print the result
        System.out.println("Sorted Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}