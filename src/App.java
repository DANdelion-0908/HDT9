import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        
        int mapNumber;
        
        Reader reader = new Reader();

        ArrayList<String> dictionary = new ArrayList<>();
        ArrayList<String> translation = new ArrayList<>();
        ArrayList<String> englishToPrint = new ArrayList<>();
        ArrayList<String> spanishToPrint = new ArrayList<>();
        ArrayList<String> adjectiveToPrint = new ArrayList<>();
        ArrayList<String> englishSpanish = new ArrayList<>();

        System.out.println("Diccionario Inglés - Español \n");

        System.out.println("Elige el tipo de mapeo que desees utilizar:");
        System.out.println("1. Red-Black Tree");
        System.out.println("2. Splay Tree.");
        System.out.println("3. Hash Map Tree. \n");
        System.out.print("Tu opción es: ");

        try (Scanner keyScanner = new Scanner(System.in)) {
            mapNumber = keyScanner.nextInt();
            System.out.println("");
        }

        MapFactory mapFactory = new MapFactory();
        IEstructuraArbol<String> dictionaryMap = mapFactory.createMap(mapNumber);
        TreeMap<String, String> map = new TreeMap<>();

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

        for (int i = 0; i < spanishToPrint.size() - 1; i++) {
            englishSpanish.add(spanishToPrint.get(i));
            englishSpanish.add(englishToPrint.get(i));
        }

        for (int i = 0; i < dictionary.size() - 1; i++) {
            dictionaryMap.add(dictionary.get(i));
        }

        for (String string : dictionary) {
            String[] words = string.toLowerCase().split(",");
            map.put(words[0], words[1]);
        }

        reader.setTranslateFile("texto.txt");
        translation = reader.readTranslate();

        for (String string : dictionary) {
            String[] words = string.toLowerCase().split(",");

            map.put(words[0], words[1]);
        }

        for (String string : translation) {
            String translateString = "";

            String[] words = string.toLowerCase().split(" ");

            for (String string2 : words) {
                String replacementString = map.get(string2);

                if(replacementString == null) {
                    translateString = translateString + "*" + string2 + "* ";

                } else {
                    translateString = translateString + replacementString + " ";

                }
            }

            System.out.println(translateString);
        }
    }
}
