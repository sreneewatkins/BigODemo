package com.tts;

// -sums an integer series from 1 to N
// -calculates the sum by adding all the numbers
// -the addition operation is inside a for loop
// -so, the total # of operations and total # of objects grow as input size grows
// This is linear time O(n)

import java.math.BigInteger;

public class LinearTimeAlgorithm {

    public BigInteger sumOfArithmeticSeries_via_add_all(long n){
        BigInteger sum = BigInteger.valueOf(0);
        for(long i = 1; i <= n; i++){
            sum = sum.add(BigInteger.valueOf(i));
        }
        return sum;
    }

}//end LinearTimeAlgorithm
