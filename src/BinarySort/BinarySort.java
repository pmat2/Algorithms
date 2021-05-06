package BinarySort;

public class BinarySort {

    /**
     * @param sortedArr sorted array to look over
     * @param searched searched value
     * @return index of searched value in array
     */
    public int binarySort(int[] sortedArr, int searched){
        int low = 0;
        int high = sortedArr.length - 1;
        int mid;                            // middle point
        int guess;

        while(low <= high){
            mid = (low + high) / 2;         // set to middle
            guess = sortedArr[mid];
            if(guess == searched){
                return mid;
            }
            if (guess > searched){          // move middle point
                high = mid - 1;
            } else {                        // move middle point
                low = mid + 1;
            }
        }
        return -1;
    }
}
