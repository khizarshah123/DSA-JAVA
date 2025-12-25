/* How Binary Search Works

Works on sorted arrays only

Compare key with middle element

Eliminate half of the array each step

Time & Space Complexity

Best Case: O(1)

Worst Case: O(log n)

Space Complexity: O(1) (iterative)*/

class BinarySearch {

    // Method to perform binary search
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid; // element found
            } 
            else if (arr[mid] < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30}; // must be sorted
        int key = 20;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}