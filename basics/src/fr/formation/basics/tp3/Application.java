package fr.formation.basics.tp3;

public class Application {

    /**
     * Ecrire le programme qui calcule pour chaque prix TTC le prix HT et
     * affiche le tout dans la console exactement comme dans les exemples
     * donn�s. Un exemple quand la mathode calculateWithoutTax est appel� avec
     * rounded = false et un autre quand la mathode calculateWithoutTax est
     * appel� avec rounded = true. Ainsi pour chaque price et rate il faut
     * appeler la m�thode calculateWithoutTax avec les param�tres correspondants
     * ce qui permettra d'afficher tout ce qui est attendu dans la console.
     */
    public static void main(String[] args) {
        /*
         * Prices contient des prix TTC (With VAT) et rates les taux de TVA
         * correspondant, ainsi le taux du premier price (49.99) est 20.0.
         */
        double[] prices = { 49.99, 19.99, 9.99, 14.59, 99.99 };
        double[] rates = { 20.0, 10.0, 10.0, 5.0, 20.0 };

        for(int i = 0; i < prices.length; i++){
            //calculateWithoutTax(prices[i], rates[i], true);
            double priceHT = calculateWithoutTax(prices[i], rates[i], true);

            System.out.println("Prix avec VAT = " + prices[i] + " // Prix sans VAT = " + priceHT + " (taux = " + rates[i] + "%)");
        }
    }

    private static double calculateWithoutTax(double price, double rate,
                                              boolean rounded) {
        // Impl�menter pour que result = price HT bas� sur rate
        double result = 0.0;
        double pourcentage = (100 + rate) / 100;
        result = price / pourcentage;
        
        /*
         * Retourne le r�sultat arrondi ou non en fonction de rounded = false ou
         * rounded = true. Rien � changer ci-dessous.
         */
        return rounded ? round(result) : result;
    }

    private static double round(double result) {
        /*
         * Impl�menter pour retourner result arrondi � 2 d�cimales. Il existe
         * plusieurs m�thodes pour arrondir en Java, travail de recherche sur
         * Google...
         */
        result = Math.round( result * 100.0 ) / 100.0;

        return result;
    }
}
