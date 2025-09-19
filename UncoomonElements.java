package TaskArray;

import java.util.Scanner;

public class UncoomonElements {   // FIX: Better spelling -> UncommonElements

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        // input size and elements for first array
        System.out.println("Enter size of first array:");
        int size1 = scan.nextInt();
        int[] arr1 = new int[size1];
        
        System.out.println("Enter elements of first array");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scan.nextInt();
        }

        // input size and elements for second array
        System.out.println("Enter size of second array:");
        int size2 = scan.nextInt();
        int[] arr2 = new int[size2];
                
        System.out.println("Enter elements of second array");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scan.nextInt();
        }

        System.out.println("Uncommon elements are:");
         
        // print elements from arr1 not in arr2
        for (int i = 0; i < size1; i++) {
            boolean found = false; // FIX: must be declared inside loop
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break; // FIX: break must be inside if, not outside
                }
            }
            if (!found) { // FIX: must be inside outer loop
                System.out.println(arr1[i] + " ");
            }
        }

        // print elements from arr2 not in arr1
        for (int i = 0; i < size2; i++) {
            boolean found = false; // FIX: must be declared inside loop
            for (int j = 0; j < size1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break; // FIX: break must be inside if
                }
            }
            if (!found) { // FIX: must be inside outer loop
                System.out.println(arr2[i] + " ");
            }
        }

        scan.close(); // FIX: was outside class in your code
    }
}
