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
        simplify();
        // gemischte Nummern sind unschön...
        if(numerator/denominator >= 1 || numerator/denominator <= -1){
            if(numerator%denominator != 0){
                if(numerator <0){
                    // wenn der bruch negativ ist, bsp. -3/2, soll es nicht -1+-1/2 geben, sondern -1-1/2
                    return ""+numerator/denominator+numerator%denominator+"/"+denominator;
                } else{
                    return ""+numerator/denominator+"+"+numerator%denominator+"/"+denominator;
                }
            } else{
                return ""+numerator/denominator;
            }
        }
        return numerator + "/" + denominator;
    }

    //equals:
    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }
    
    //simplification:
    public void simplify(){
        if(this.denominator < 0){
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        int divisor = gcd(this.numerator,this.denominator);
        this.numerator /= divisor;
        this.denominator /= divisor;
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

    public void add(int f) {
        this.setNumerator(this.numerator + this.denominator * f);
    }

    public static Fraction add(Fraction f, int g) {
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

    public void multiply(int f) {
        this.setNumerator(this.numerator * f);
    }

    public static Fraction multiply(Fraction f, int g) {
        Fraction a = new Fraction(f);
        a.multiply(g);
        return a;
    }

    //subtraction:
    public void subtract(Fraction f) {
        Fraction a = new Fraction(f);
        a.setNumerator(-a.numerator);
        this.add(a);
    }

    public static Fraction subtract(Fraction f, Fraction g) {
        Fraction a = new Fraction(f);
        Fraction b = new Fraction(g);
        b.setNumerator(-b.numerator);
        a.add(b);
        return a;
    }

    public void subtract(int a) {
        this.add(-a);
    }

    public static Fraction subtract(Fraction f, int g) {
        Fraction a = new Fraction(f);
        a.add(-g);
        return a;
    }
    
    //dividation:
    public void divide(Fraction f) {
        if(f.numerator == 0){
            throw new ArithmeticException("Division by zero");
        }
        this.setNumerator(this.numerator * f.denominator);
        this.setDenominator(this.denominator * f.numerator);
    }

    public static Fraction divide(Fraction f, Fraction g) {
        if(g.numerator == 0){
            throw new ArithmeticException("Division by zero");
        }
        Fraction a = new Fraction(f);
        Fraction b = new Fraction(g);
        int save = b.numerator;
        b.setNumerator(b.denominator);
        b.setDenominator(save);
        a.multiply(b);
        return a;
    }

    public void divide(int f) {
        if(f == 0){
            throw new ArithmeticException("Division by zero");
        }
        this.setDenominator(this.denominator * f);
    }

    public static Fraction divide(Fraction f, int g) {
        if(g == 0){
            throw new ArithmeticException("Division by zero");
        }
        Fraction a = new Fraction(f);
        Fraction b = new Fraction(1,g);
        a.multiply(b);
        return a;
    }

    // copypaste von Aufgabe 15 c) Rekursion
    private static int gcd(int a, int b){
        if(b%a != 0){
            return gcd(b%a,a);
        } else{
            return a;
        }
    }
}
