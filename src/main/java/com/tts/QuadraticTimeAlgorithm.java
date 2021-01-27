package com.tts;

// -sort an integer array via insertion_sort method that has 2 loops
// This class is O(n^2)

public class QuadraticTimeAlgorithm {

    public void insertion_sort(int[] numberArray) {
        int n = numberArray.length;
        for (int i = 1; i < n; ++i) {
            int position = numberArray[i];
            int j = i - 1;

            while (j >= 0 && numberArray[j] > position) {
                numberArray[j + 1] = numberArray[j];
                j = j - 1;
            }
            numberArray[j + 1] = position;
        }
    }

}//end QuadraticAlgorithm class
