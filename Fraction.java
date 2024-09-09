public class Fraction {
    public static void main(String[] args) {
        int fraction1num = 1;
        int fraction1den = 4;
        int fraction2num = 3;
        int fraction2den = 5;

        int fractionSumNum = fraction1num * fraction2den + fraction2num * fraction1den;
        int fractionSumDen = fraction1den * fraction2den;

        System.out.println("The sum of " + fraction1num + "/" + fraction1den + " and " + fraction2num + "/" + fraction2den + " is " + fractionSumNum + "/" + fractionSumDen);

        
    }
}
