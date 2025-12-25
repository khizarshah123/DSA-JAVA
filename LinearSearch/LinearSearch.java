/* How Linear Search Works

Start from the first element

Compare each element with the key

Stop when the element is found or array ends

⏱ Time & Space Complexity

Best Case: O(1)

Worst Case: O(n)

Space Complexity: O(1)

📌 When to Use Linear Search

Small datasets

Unsorted arrays

Simple implementation needed */

class LinearSearch{

    // Method to perform linear search
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // element found at index i
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 60};
        int key = 30;

        int result = linearSearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}