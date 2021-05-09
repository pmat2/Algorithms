import coins.CoinCounter;
import coins.Coins;
import binarySearch.BinarySearch;
import canConstruct.CanConstruct;
import canSum.CanSum;
import fibonacci.Fibonacci;
import gridTraveler.GridTraveler;
import sort.Sort;
import sum.Sum;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        /*
         * Given set of coins calculate optimal way of giving change
         */
        // Specify desired available coins
        CoinCounter cc = new CoinCounter(List.of(
                Coins.FIVEHUNDRED,
                Coins.TWOHUNDRED,
                Coins.HUNDRED,
                Coins.FIFTY,
                Coins.TWENTY,
                Coins.TEN,
                Coins.FIVE,
                Coins.TWO,
                Coins.ONE)
        );
        // Use this if all coins are available
        // CoinCounter cc2 = new CoinCounter(Arrays.asList(main.java.Coins.values()));

        double nominal = 0.99;
        int rest = cc.recountNominal(nominal);
        System.out.println("\nOptimal number of coins: " + cc.minimumGiveTheChangeCoins(rest) + "\n\tas a change = " + nominal);
        System.out.println("Change coins: " + cc.giveTheChange(rest) + "\n\tfor " + nominal);


        /*
         * Calculate n-th number of main.java.Fibonacci.main.java.Fibonacci sequence
         */
        int fiboNumber = 25;
        Fibonacci fibonacciSequence = new Fibonacci(fiboNumber);

        // Memoized approach
        long timeBefore = System.currentTimeMillis();
        System.out.println("\n" + fiboNumber + "-th number of Fibonacci sequence is = "
                + fibonacciSequence.fibonacciSequenceMemoized(fiboNumber));
        long timeAfter = System.currentTimeMillis();
        System.out.println("Memoized Fibonacci function executed in "
                + (timeAfter - timeBefore) + " ms");

        // Regular approach
        timeBefore = System.currentTimeMillis();
        System.out.println("\n" + fiboNumber + "-th number of Fibonacci sequence is = "
                + fibonacciSequence.fibonacciSequence(fiboNumber));
        timeAfter = System.currentTimeMillis();
        System.out.println("Regular Fibonacci function executed in " + (timeAfter - timeBefore) + " ms");


        /*
         * Calculate number of possible paths on grid from point 0,0 to m,n
         * m - number of rows, n - number of columns
         */
        int m = 18;
        int n = 18;
        GridTraveler gridTraveler = new GridTraveler();

        timeBefore = System.currentTimeMillis();
        System.out.println("\nGrid traveler can pass ("
                + m + " by " + n + ") grid in "
                + gridTraveler.gridTravel(m, n) + " different ways");
        System.out.println("Grid travel time: " + (System.currentTimeMillis() - timeBefore)
                + " ms\n\tfor: m = " + m + ", n = " + n);
//        System.out.println(gridTraveler.gridTravel(m,n)); //-> way too long, trust me

        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, 17, 18};
        int searchedVal = 15;
        timeBefore = System.currentTimeMillis();
        System.out.println("\nBinary search of " + array.length + " elements array for value: " + searchedVal
                + "\n\tindex: " + binarySearch.binarySearch(array, searchedVal));
        timeAfter = System.currentTimeMillis();
        System.out.println("Searching took " + (timeAfter - timeBefore) + " ms");


        /*
         * Given array of numbers arr and number n, check if it is possible to sum elements of arr to get n number
         */
        CanSum canSum = new CanSum();
        int[] csArray = {7, 14};
        int csNum = 300;
        timeBefore = System.currentTimeMillis();
        System.out.println("\nElements from array: " + Arrays.toString(csArray)
                + "\n\t"
                + (canSum.canSum(csNum, csArray) ? "do" : "do not")
                + " sum to number: " + csNum);
        timeAfter = System.currentTimeMillis();
        System.out.println("Computations took " + (timeAfter - timeBefore) + " ms");

        Sum sum = new Sum();
        int[] sArray = {1,2,3,4,5};
        timeBefore = System.currentTimeMillis();
        System.out.println("\nmain.java.Sum of elements in array: "
                + Arrays.toString(sArray)
                + " = " + sum.sumArray(sArray));
        timeAfter = System.currentTimeMillis();
        System.out.println("Execution time: " + (timeAfter - timeBefore) + " ms");

        Sort sort = new Sort();
        int[] qsortArr = {5,8,2,3,10,0,2,-1,99,101,64,23,85,32,58,95,11,13,75,246};
        sort.quicksort(qsortArr, 0, (qsortArr.length - 1));
        timeBefore = System.currentTimeMillis();
        System.out.println("\nQuick sort on " + qsortArr.length + "-elements array"
                + "\n\tsorted array: " + Arrays.toString(qsortArr)
                + "\n\ttook " + (System.currentTimeMillis() - timeBefore) + " ms");


        /*
        * Given string target word, and list of strings check if it is possible to create words from elements from list
        */
        CanConstruct canConstruct = new CanConstruct();
        List<String> stringList = Arrays.asList("a", "aa", "aaaa", "aaaaaaaaaa", "aaaaaaaaaaaaaaaa");
        String word = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz";

        timeBefore = System.currentTimeMillis();
        System.out.println("\nIt " + ((canConstruct.canConstruct(word, stringList)) ? "is" : "is not")
                + " possible to create word: " + word
                + "\n\tfrom list of words: " + stringList
                + "\n\t with regular function"
                + " it took " + (System.currentTimeMillis() - timeBefore) + " ms");

        timeBefore = System.currentTimeMillis();
        System.out.println("\nIt " + ((canConstruct.canConstructMemo(word, stringList)) ? "is" : "is not")
                + " possible to create word: " + word
                + "\n\tfrom list of words: " + stringList
                + "\n\t with memoized function"
                + " it took " + (System.currentTimeMillis() - timeBefore) + " ms");
    }
}
