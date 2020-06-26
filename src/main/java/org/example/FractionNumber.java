package org.example;


import java.util.Objects;


public class FractionNumber {
    private final  Integer numerator;
    private final  Integer denominator;
    private ReduceFraction reduceFraction = new ReduceFraction();

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

   public FractionNumber reduce(){
       return reduceFraction.reduce(this);
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
