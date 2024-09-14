public class Store {
    public static void main(String[] args) {
        //cambiar las ventas hechas como constantes y los nombres de sus variables 
        final int SALES_DAY1 = 15;
        final int SALES_DAY2 = 10;
        final int SALES_DAY3 = 5;
        //cambiar los numeros magicos por numeros de personas que compran
        final int NUMBER_PEOPLE_DAY1 = 2;
        final int NUMBER_PEOPLE_DAY2 = 3;
        final int NUMBER_PEOPLE_DAY3 = 4;
        // añadir 50 como una constante
        final int averageSales = 50;

        //ser mas claro con las variables de totales de ventas 
        int totalSales1 = SALES_DAY1 * NUMBER_PEOPLE_DAY1;
        int totalSales2 = SALES_DAY2 * NUMBER_PEOPLE_DAY2;
        int totalSales3 = SALES_DAY3 * NUMBER_PEOPLE_DAY3;

        int totalSales = totalSales1 + totalSales2 + totalSales3;

        if (totalSales > averageSales ) {
            System.out.println("Good sales performance"); //Buen desempeño en ventas
        } else {
            System.out.println("Low sales performance"); // Bajo rendimiento de ventas
        }
    }
}
