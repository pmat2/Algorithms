package sort;

public class Sort {

    /**
     * Quick sort
     * @param arr array of ints
     * @param beginIndex index of first element
     * @param endIndex index of last element
     */
    public void quicksort(int[] arr, int beginIndex, int endIndex){
        if (beginIndex < endIndex){
            int partitionIndex = partition(arr, beginIndex, endIndex);

            quicksort(arr, beginIndex, partitionIndex-1);
            quicksort(arr,partitionIndex + 1, endIndex);
        }
    }

    /**
     * Pivot function
     * @param arr array of ints
     * @param begin index of first element
     * @param end index of last element
     * @return returns index of pivot
     */
    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int index = (begin - 1);

        for(int j = begin; j < end; j++){
            if(arr[j] <= pivot){
                index++;

                swap(arr, index, j);
            }
        }
        swap(arr, index+1, end);

        return index + 1;
    }

    /**
     * Swap function
     * @param arr array of ints
     * @param i index
     * @param j index
     */
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
