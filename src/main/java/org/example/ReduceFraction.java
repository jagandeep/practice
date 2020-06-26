package org.example;

import java.util.Arrays;
import java.util.List;

public class ReduceFraction {

    static List<Integer> getPrimeNumbers() {
        return Arrays.asList(2,3,4,5,6,7,8,9,10,11,13,17,19,23);
    }

    public FractionNumber reduce(FractionNumber number) {
        return reduceFraction(number,getPrimeNumbers());
    }

    private FractionNumber reduceFraction(FractionNumber calculation, List<Integer> primes) {
        FractionNumber reducedFraction = makeReducedFraction(calculation,primes);
        if(reducedFraction.equals(calculation))
            return reducedFraction;
        else
           return reduceFraction(reducedFraction,getPrimeNumbers());
    }

    private FractionNumber makeReducedFraction(FractionNumber calculation, List<Integer> primes) {
        FractionNumber result  = calculation;
        for(Integer prime : primes){
            if(isDivisibleByPrime(calculation, prime))
                result = new FractionNumber(calculation.getNumerator() / prime, calculation.getDenominator() / prime);
        }
        return result;
    }

    private boolean isDivisibleByPrime(FractionNumber calculation, Integer num) {
        return calculation.getNumerator() % num == 0 && calculation.getDenominator() % num == 0;
    }
}
