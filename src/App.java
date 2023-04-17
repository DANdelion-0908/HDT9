public class App {

    public static void main(String[] args) {
        
        System.out.println("Diccionario Inglés - Español");
        
        Reader spanishReader = new Reader();

        spanishReader.setFile("Spanish.txt");

        System.out.println(spanishReader.read(spanishReader.getFile())); 
    }
}
