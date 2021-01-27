package com.tts;

// -sums an integer series from 1 to N
// -calculates the sum via a mathematics formula with 3 operations: *,+,/
// -the total number of operations is constant 3 regardless of the input size N
// -the total memory used is 3 BigInteger objects
// -the constant is ignored due to its insignificance
//This algorithm has a constant time and space complexity O(1).

import java.math.BigInteger;

public class ConstantTimeAlgorithm {

    //arithmetic series formula an = a1 + (n - 1)d
    public BigInteger sumOfArithmeticSeries_via_formula(long n){
        return BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1).divide(BigInteger.valueOf(2)));
    }


}//end ConstantTimeAlgorithm
