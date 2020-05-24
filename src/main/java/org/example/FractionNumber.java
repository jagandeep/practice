package org.example;


import java.util.Arrays;
import java.util.Objects;


public class FractionNumber {
    private final  Integer numerator;
    private final  Integer denominator;

    public FractionNumber(int numerator, int denominator) {
        this.numerator =numerator;
        this.denominator = denominator;
    }
    public FractionNumber(int numerator) {
        this.numerator =numerator;
        this.denominator = 1;
    }

    public Integer getNumerator() {
        return numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public static FractionNumber reduce(FractionNumber number) {
        if(isNumeratorEqualDenominator(number))
            return number;
        return reduceToLowestFraction(number);
    }

    private static FractionNumber reduceToLowestFraction(FractionNumber number) {
        FractionNumber  calculation = number;
        for(Integer num : Arrays.asList(2,3,4,5,6,7,8,9,10,11,13,17,19,23)){
            calculation = reduceBy(num,calculation);
        }
        return calculation;
    }

    private static boolean isNumeratorEqualDenominator(FractionNumber number) {
        return number.numerator.equals(number.denominator);
    }

    private static FractionNumber reduceBy(Integer prime,FractionNumber number){
        if(number.numerator % prime == 0 && number.denominator % prime == 0)
            return  new FractionNumber(number.numerator/prime, number.denominator/prime);
        else
            return  number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return numerator.equals(that.numerator) &&
                denominator.equals(that.denominator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "FractionNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

}
