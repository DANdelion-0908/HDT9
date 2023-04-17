public class App {

    public static void main(String[] args) {
        
        System.out.println("Diccionario Inglés - Español \n");
        
        System.out.println("Leyendo archivo...");
        new ProgressBar();
        System.out.println("");

        Reader spanishReader = new Reader();
        spanishReader.setFile("Spanish.txt");
        System.out.println(spanishReader.read(spanishReader.getFile())); 
    }
}
