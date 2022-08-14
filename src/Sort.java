public class Sort {
        public static void bubbleSort(int [] sort_arr, int len){

                for (int i=0;i<len-1;++i){

                        for(int j=0;j<len-i-1; ++j){

                                if(sort_arr[j+1]<sort_arr[j]){

                                        int swap = sort_arr[j];
                                        sort_arr[j] = sort_arr[j+1];
                                        sort_arr[j+1] = swap;

                                }
                        }
                }
        }
        public static void insertionSort(int[] arr) {
                for (var i =1; i<arr.length; i++) {
                        var current = arr[i];
                        var j = i - 1;
                        while (j >= 0 && arr[j] > current) {
                                arr[j + 1] = arr[j];
                                j--;
                        }
                        arr[j + 1] = current;
                }
        }

        static void swap(int[] arr, int i, int j)
        {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }

        public static int partition(int[] array, int low, int high) {
                int pivot = array[high]; // choose rightmost as pivot
                int i = (low-1);
                //move through all elements and compare with pivot
                for (int j = low; j <= high - 1; j++) {
                        if (array[j] < pivot) {
                                i++; //if element is smaller than pivot, swap with larger element

                                swap(array, i, j);
                        }
                }

                swap(array, i + 1, high);
                return (i + 1);
        }


        static void quickSort(int[] array, int low, int high) {
                if (low < high) {
                        // pi is partitioning index, arr[p]
                        // is now at right place
                        int pi = partition(array, low, high);

                        // Separately sort elements before
                        // partition and after partition
                        quickSort(array, low, pi - 1);
                        quickSort(array, pi + 1, high);
                }
        }

        static void printArray(int[] arr, int size)
        {
                for(int i = 0; i < size; i++)
                        System.out.print(arr[i] + " ");

                System.out.println();
        }

        static void heapify(int a[], int n, int i)
        {
                int largest = i; // Initialize largest as root
                int left = 2 * i + 1; // left child
                int right = 2 * i + 2; // right child
                // If left child is larger than root
                if (left < n && a[left] > a[largest])
                        largest = left;
                // If right child is larger than root
                if (right < n && a[right] > a[largest])
                        largest = right;
                // If root is not largest
                if (largest != i) {
                        // swap a[i] with a[largest]
                        int temp = a[i];
                        a[i] = a[largest];
                        a[largest] = temp;

                        heapify(a, n, largest);
                }
        }
        /*Function to implement the heap sort*/
        static void heapSort(int[] a, int n)
        {
                for (int i = n / 2 - 1; i >= 0; i--)
                        heapify(a, n, i);

                // One by one extract an element from heap
                for (int i = n - 1; i >= 0; i--) {
                        /* Move current root element to end*/
                        // swap a[0] with a[i]
                        int temp = a[0];
                        a[0] = a[i];
                        a[i] = temp;

                        heapify(a, i, 0);
                }
        }
        /* function to print the array elements */
        static void printArr(int[] a, int n)
        {
                for (int i = 0; i < n; ++i)
                        System.out.print(a[i] + " ");
        }

}

