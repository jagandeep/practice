package org.example;

public class Fraction {

    public FractionNumber  add(FractionNumber number1, FractionNumber number2) {
        FractionNumber result ;
        if(number1.getDenominator().equals(number2.getDenominator())) {
            result = new FractionNumber(number1.getNumerator()  +
                    number2.getNumerator() ,
                    number1.getDenominator());
        }else {
            number1 = FractionNumber.reduce(number1);
            number2 = FractionNumber.reduce(number2);
            result = new FractionNumber(number1.getNumerator()*number2.getDenominator()+
                    number2.getNumerator()* number1.getDenominator(),
                    number1.getDenominator()*number2.getDenominator());
        }
        
        return FractionNumber.reduce(result);
    }
}
