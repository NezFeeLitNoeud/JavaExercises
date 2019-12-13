package fr.formation.basics.tp2;

public class Application {

    public static void main(String[] args) {
        String word = "Java";

        countCharts(word, 'J');
        countCharts(word, 'a');
        countCharts(word, 'v');
        countCharts(word, 'x');

    }

    public static void countCharts(String src, char value){
        int correspondance = 0;
        for(int i = 0; i < src.length(); i++){
            if(src.charAt((i)) == value){
                correspondance++;
            }
        }

        System.out.println("Correspondance trouvée : " + correspondance);


    }
}
