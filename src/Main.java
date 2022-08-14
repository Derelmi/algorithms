import java.util.*;
import java.lang.*;

public class Main {
    // Linear Search
    public static int linearSearch(int[] arr, int x) {
        int arrLength = arr.length;

        // Loop through array to find a match for x
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (using recursion)
    public static int binarySearch(int[] arr, int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearch(arr, first, mid-1, key); //search in left subarray
            }else{
                return binarySearch(arr, mid+1, last, key); //search in right subarray
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Hello, welcome to the Algorithm Tester!
                =======================================
                
                What type of algorithm would you like to implement
                ( 1 ) Search Algorithms
                ( 2 ) Sorting Algorithms
                
                """);
        int algoOption = sc.nextInt();

        if (algoOption == 1){
            System.out.println("""
                    Here are the available Search Algorithms.
                    ( 1 ) Linear Search
                    ( 2 ) Binary Search
                    """);
            int searchOption = sc.nextInt();

            if (searchOption == 1) {
                System.out.println("\nEnter 10 numbers separated with ONLY a space");

                int[] nums = new int[10];
                int i;

                // Loop to store input values in nums array
                for (i = 0; i < nums.length; i++) {
                    nums[i] = sc.nextInt();
                }

                System.out.println("\nEnter the number you want to search for");

                int searchValue = sc.nextInt();

                int answer = linearSearch(nums, searchValue);

                if ( answer == -1) {
                    System.out.println("\nElement is not present in list");
                }
                else {
                    System.out.println("\nElement is present at index: " + answer);
                }
            }
            else if (searchOption == 2) {
                System.out.println("\nEnter 10 numbers separated with ONLY a space");

                int[] nums = new int[10];
                int i;
                int last = nums.length - 1;

                // Loop to store input values in nums array
                for (i = 0; i < nums.length; i++) {
                    nums[i] = sc.nextInt();
                }

                System.out.println("\nEnter the number you want to search for");

                int searchValue = sc.nextInt();

                int answer = binarySearch(nums, 0, last, searchValue);

                if (answer == -1)
                    System.out.println("Element is not found!");
                else
                    System.out.println("Element is found at index: "+ answer);
            }
        }
        else if (algoOption == 2) {
            System.out.println("""
                    Here are the available Sorting Algorithms
                    
                    ( 1 ) Heap Sort
                    ( 2 ) Merge Sort
                    ( 3 ) Radix Sort
                    ( 4 ) Quick Sort
                    """);
        }
        else {
            System.out.println("Enter a valid input");
        }
    }



    
        public static int partition(int array[], int low, int high) {
            int pivot = array[high]; // choose rightmost as pivot
            int i = (low-1);
            //move through all elements and compare with pivot
            for (int j = low; j < high; j++) {
                if (array[j] <=pivot) {
                    i++; //if element is smaller than pivot, swap with larger element

                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            
            int temp = array[i + 1]; // swap the pivot element with larger element specified by i
            array[i + 1] = array[high];
            array[high] = temp;
            
            return (i + 1);
        }


        static void quickSort(int array[], int low, int high) {
            if (low < high) {
                // find pivot element such that elements smaller than pivot are on the left
                //  and elements greater than pivot are on the right
                
                int p = partition(array, low, high); // recursive call on the left of pivot
                quickSort(array, low, p - 1);

                quickSort(array, high, p + 1,); // recursive call on the right of pivot
                 
            }
        }
   

class Main {
  public static void main(String args[]) {

    int[] data = { 7, 5, 2, 3, 0, 1, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));

    int size = data.length;

    // call quicksort() on array data
    Quicksort.quickSort(data, 0, size - 1);

    System.out.println("Sorted Array in Ascending Order ");
    System.out.println(Arrays.toString(data));
  }
}


    

}