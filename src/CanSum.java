import java.util.HashMap;

public class CanSum {


    /**
     * Wrapper function, passes HashMap
     * @param sum checked number
     * @param sumArray array of values
     * @return true if sum, false if not
     */
    public boolean canSum(int sum, int[] sumArray){
        return canSum(sum, sumArray, new HashMap<>());
    }

    /**
     * Memoized functions checks if it is possible to add up elements from sumArray to get sum
     * @param sum checked number
     * @param sumArr array of values
     * @param memo argument passed by wrapped
     * @return true if sum, false if not
     */
    private boolean canSum(int sum, int[] sumArr, HashMap<Integer, Boolean> memo){
        if(memo.containsKey(sum)) return memo.get(sum);
        if(sum == 0) return true;
        if (sum < 0) return false;

        for(int num : sumArr){
            if(canSum(sum - num, sumArr, memo)){
                memo.put(sum, true);
                return true;
            }
        }
        memo.put(sum, false);
        return false;
    }
}
