/*How Bubble Sort Works

Compare adjacent elements

Swap if they are in wrong order

Largest elements “bubble” to the end after each pass

Time & Space Complexity

Best Case: O(n) (if already sorted, with optimization)

Worst Case: O(n²)

Space Complexity: O(1)

When to Use Bubble Sort

Small datasets

Teaching/learning sorting basics

Rarely used in real-world large datasets */

class BubbleSort {

    // Method to perform bubble sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}