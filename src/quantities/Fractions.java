package quantities;

public class Fractions {
    private int numerator;
    private int denominator;

    public Fractions() {
    }

    public Fractions(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "quantities.Fractions: " + numerator + " / " + denominator;
    }
}
