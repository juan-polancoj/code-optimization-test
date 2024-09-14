public class TaxCalculation {
    public static void main(String[] args) {
        double productPrice1 = 100;
        double productPrice2 = 200;
        // cambiar los valore magicos por constantes
        final double TAX_RATE_THRESHOLD = 50;
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.10;
        // sustituir los valores magicos por sus constantes y se multiplican 
        double tax1 = productPrice1 * TAX_RATE_HIGH;
        double tax2 = productPrice2 * TAX_RATE_LOW;
        double totalTax = tax1 + tax2;
        
        if (totalTax > TAX_RATE_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
