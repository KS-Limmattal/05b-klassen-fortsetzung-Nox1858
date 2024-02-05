
public class MixedNumber extends Fraction {
    private int integer = 0;

    public MixedNumber(int numerator, int denominator, int integer) {
        super(getRestFraction(numerator,denominator));
        this.integer = integer + getRestInteger(numerator,denominator);
    }

    public MixedNumber(Fraction f, int integer) {
        this(f.getNumerator(),f.getDenominator(),integer);
    }

    public MixedNumber(int integer) {
        this.integer = integer;
    }

    public MixedNumber(Fraction f) {
        super(f);
    }

    public static Fraction getRestFraction(int numerator,int denominator){
        Fraction f = new Fraction(numerator,denominator);
        f.simplify();
        if(numerator/denominator < 0){
            f.add(numerator/denominator);
        }
        f.subtract(numerator/denominator);
        return f;

    }
    public static int getRestInteger(int numerator,int denominator) {
        return numerator / denominator;
    }

    @Override
    public String toString() {
        super.simplify();
        int numerator = super.getNumerator();
        int denominator = super.getDenominator();
        if(numerator == 0){
            return ""+integer;
        }
        if(numerator/denominator >= 1 || numerator/denominator <= -1){
            if(numerator%denominator != 0){
                if(numerator <0){
                    // wenn der bruch negativ ist, bsp. -3/2, soll es nicht -1+-1/2 geben, sondern -1-1/2
                    return ""+(numerator/denominator+integer)+numerator%denominator+"/"+denominator;
                } else{
                    return ""+(numerator/denominator+integer)+"+"+numerator%denominator+"/"+denominator;
                }
            } else{
                return ""+numerator/denominator+integer;
            }
        }
        if(integer!= 0){
            return integer +"+"+ numerator + "/" + denominator;
        }
        return numerator + "/" + denominator;
    }
}
