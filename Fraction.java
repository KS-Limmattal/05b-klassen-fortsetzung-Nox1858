public class Fraction {
    static int numberOfFractions;
    private int numerator, denominator;

    //Constructors:
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.setDenominator(denominator);
        numberOfFractions++;
    }
    
    public Fraction(Fraction f) {
        this(f.numerator, f.denominator);
    }

    public Fraction() {
        this(0, 1);
    }

    //setters:
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            this.denominator = denominator;
        }
    }

    //getters:
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //toString:
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    //equals:
    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }

    //addition:
    public void add(Fraction f) {
        this.setNumerator(this.numerator * f.denominator + this.denominator * f.numerator);
        this.setDenominator(this.denominator * f.denominator);
    }

    public static Fraction add(Fraction f, Fraction g) {
        Fraction a = new Fraction(f);
        a.add(g);
        return a;
    }
    
    //multiplication:
    public void multiply(Fraction f) {
        this.setNumerator(this.numerator * f.numerator);
        this.setDenominator(this.denominator * f.denominator);
    }

    public static Fraction multiply(Fraction f, Fraction g) {
        Fraction a = new Fraction(f);
        a.multiply(g);
        return a;
    }

}
