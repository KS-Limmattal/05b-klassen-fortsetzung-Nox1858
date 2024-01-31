public class FractionTester {
    public static void main(String[] args) {
        final double PI = 3.14159;
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
        System.out.println(Fraction.numberOfFractions);
        // Konstanten:
        // PI++; //geht nicht, wird von VSC unterstrichen
        System.out.println(PI);

         /* public static void main(String args){}
         * public static, da von auserhalb darauf zugegriffen werden soll (Programm ausführen zum Beispiel) und änderungen vorgenommen werden sollen. 
         * void, da es bloss ausführt und nichts returnen soll.
         * main, der Name der Methode, so gewählt das Java versteht das diese Methode das ist was ausgeführt werden soll.
         * String args, die Variablen, die beim Aufrufen der Klasse eingegeben werden, darauf kann vom Code aus zugegriffen werden.
         * 
         * Sichtbarkeit:
         * Ich kann nichts unterstreichen, also schreibe ich (static) vor die 'unterstrichenen' Methoden
         * UML:
         * 
         * Fraction.java
         * + numberOfFractions : int
         * - numerator: int
         * - denominator: int
         * ____________________________
         * + Fraction()
         * + Fraction(f : Fraction)
         * + Fraction(int : numerator, int : denominator)
         * + setNumerator(int: numerator)
         * + setDenominator(int : denominator)
         * + getNumerator : int
         * + getDenominator : int
         * + toString() : String
         * + equals() : bool
         * + add(Fraction f)
         * + (static) add(Fraction f, Fraction g) : Fraction
         * + multiply(Fraction f)
         * + (static) multiply(Fraction f, Fraction g) : Fraction
         * 
         * (als nächstes folgt noch:)
         * 
         * + subtract(Fraction f)
         * + (static) subtract(Fraction f, Fraction g) : Fraction
         * + divide(Fraction f)
         * + (static) divide(Fraction f, Fraction g) : Fraction
         * 
         * + simplify()
         * 
         * + add(int a)
         * + (static) add(Fraction f, int a) : Fraction
         * + multiply(int a)
         * + (static) multiply(Fraction f, int a) : Fraction
         * + subtract(int a)
         * + (static) subtract(Fraction f, int a) : Fraction
         * + divide(int a)
         * + (static) divide(Fraction f, int a) : Fraction
         */

        //Testcode für simplify()
        Fraction l = new Fraction(6, 9);
        Fraction n = new Fraction(125,25);
        System.out.println(l+" "+n);
        Fraction.divide(l, 2);
        l.divide(n);
        System.out.println(l);
        try{
            n.divide(0);
        } catch(Exception e){
            System.out.println(e);
        }
        n.subtract(l);
        System.out.println(n);
        Fraction o = new Fraction(-3,12);
        n.divide(o);
        System.out.println(n);
    }

}
