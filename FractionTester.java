public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction();

        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat
        // sind:
        // f.numerator = 12;
        // f.denominator = 0;
        // System.out.println(f.numerator + "/" + f.denominator);

        f.setNumerator(126);
        f.setDenominator(3);

        // toString():
        System.out.println(f);
        // Encapsulation, Getter und Setter:
        Fraction g = new Fraction(16, 2);
        Fraction m = new Fraction(42, 1);
        // Copy-Konstruktor und equals():
        Fraction h = new Fraction(f);
        System.out.println(m + " und " + f + " sind " + (m.equals(f) ? "" : "nicht ") + "gleich!");
        System.out.println(m + " und " + g + " sind " + (m.equals(g) ? "" : "nicht ") + "gleich!");
        // Klassen- und Instanzenmethoden:
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(2,3);
        Fraction c = new Fraction(1,5);
        Fraction d = Fraction.add(a,b);
        System.out.println(d+" "+a+" "+b);
        a.add(c);
        System.out.println(a);
        // statische Variablen:

    }

}
