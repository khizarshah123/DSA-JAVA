/*DynamicArray

GrowableArray

ResizableArray

SmartArray
*/
class MyArrayList{
    private int[] arr;
    private int size;
    private int capacity;

    // Constructor
    public MyArrayList() {
        capacity = 2;
        arr = new int[capacity];
        size = 0;
    }

    // Add element
    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = value;
    }

    // Resize array
    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Get element
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return arr[index];
    }

    // Remove last element
    public void removeLast() {
        if (size > 0) {
            size--;
        } else {
            System.out.println("ArrayList is empty");
        }
    }

    // Size of ArrayList
    public int size() {
        return size;
    }

    // Display elements
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();

        System.out.println("Element at index 2: " + list.get(2));

        list.removeLast();
        list.display();
    }
}