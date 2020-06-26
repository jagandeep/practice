package org.example;

public class Fraction {

    public FractionNumber add(FractionNumber number1, FractionNumber number2) {
        return addFraction(number1, number2).reduce();
    }

    private FractionNumber addFraction(FractionNumber number1, FractionNumber number2) {
        return new FractionNumber(number1.getNumerator()* number2.getDenominator()+
                number2.getNumerator() * number1.getDenominator(),
                number1.getDenominator() * number2.getDenominator());
    }

}
