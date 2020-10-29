package manage;

import quantities.Fractions;

public class Calculate {
    public Fractions add(Fractions firstFraction, Fractions secondFraction){
        int numerator = firstFraction.getNumerator()*secondFraction.getDenominator()+secondFraction.getNumerator()*firstFraction.getDenominator();
        int denominator = firstFraction.getDenominator()*secondFraction.getDenominator();

        return findMinimalFractions(new Fractions(numerator,denominator));
    }

    public Fractions subtract(Fractions firstFraction,Fractions secondFraction){
        int numerator = firstFraction.getNumerator()*secondFraction.getDenominator()-secondFraction.getNumerator()*firstFraction.getDenominator();
        int denominator = firstFraction.getDenominator()*secondFraction.getDenominator();

        return findMinimalFractions(new Fractions(numerator,denominator));
    }

    public Fractions multiply(Fractions firstFraction,Fractions secondFraction){
        int numerator = firstFraction.getNumerator()*secondFraction.getNumerator();
        int denominator = firstFraction.getDenominator()*secondFraction.getDenominator();

        return findMinimalFractions(new Fractions(numerator,denominator));
    }

    public Fractions divide(Fractions firstFraction,Fractions secondFraction){
        if(secondFraction.getNumerator() == 0){
            System.out.println("cant divide because second fractions equals zero!");
            return null;
        }
        int numerator = firstFraction.getNumerator()*secondFraction.getDenominator();
        int denominator = firstFraction.getDenominator()*secondFraction.getNumerator();

        return findMinimalFractions(new Fractions(numerator,denominator));

    }

    public int findGreatestCommonDivisor(int firstNumber,int secondNumber){
        for (int i = Integer.min(firstNumber,secondNumber); i > 1; i--) {
            if(firstNumber % i == 0 && secondNumber % i == 0){
                return i;
            }
        }
        return 1;
    }

    public boolean isMinimalFractions(Fractions fractions){
        return findGreatestCommonDivisor(fractions.getNumerator(), fractions.getDenominator()) == 1;
    }

    public Fractions findMinimalFractions(Fractions fractions){
        int nume = fractions.getNumerator();
        int deno = fractions.getDenominator();
        int gcd = findGreatestCommonDivisor(Math.abs(nume),Math.abs(deno));
        if(nume*deno > 0){
            return new Fractions(Math.abs(nume/gcd),Math.abs(deno/gcd));
        }
        return new Fractions(-Math.abs(nume/gcd),Math.abs(deno/gcd));
    }


}
