import java.util.ArrayList;
import java.util.Scanner;

import structure5.SplayTree;

public class App {

    public static void main(String[] args) {
        
        int mapNumber;
        
        Reader reader = new Reader();

        ArrayList<String> dictionary = new ArrayList<>();
        ArrayList<String> translation = new ArrayList<>();
        ArrayList<String> englishToPrint = new ArrayList<>();
        ArrayList<String> spanishToPrint = new ArrayList<>();
        ArrayList<String> adjectiveToPrint = new ArrayList<>();

        System.out.println("Diccionario Inglés - Español \n");

        System.out.println("Elige el tipo de mapeo que desees utilizar:");
        System.out.println("1. Red-Black Tree");
        System.out.println("2. Splay Tree.");
        System.out.println("3. TreeMap. \n");
        System.out.print("Tu opción es: ");

        try (Scanner keyScanner = new Scanner(System.in)) {
            mapNumber = keyScanner.nextInt();
            System.out.println("");
        }

        MapFactory mapFactory = new MapFactory();
        mapFactory.createMap(mapNumber);

        System.out.println("Leyendo archivo...");
        new ProgressBar();
        System.out.println("");

        try {
            reader.setDictionaryFile("Spanish.txt");
            dictionary = reader.readDictionary();

        } catch (Exception e) {
            System.out.println("Ingresa un archivo con el nombre correcto.");
            e.printStackTrace();
        }

        for (String string: dictionary) {
            String[] sentenceString = string.toLowerCase().split(",");

            englishToPrint.add(sentenceString[0]); 
            spanishToPrint.add(sentenceString[1]);
            adjectiveToPrint.add(sentenceString[2]); 
        }

        System.out.println(englishToPrint);
        System.out.println(spanishToPrint);
        System.out.println(adjectiveToPrint);
    }
}
