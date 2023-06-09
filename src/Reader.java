import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Reader {
    
    private String dictionaryFile;
    private String translateFile;

    /**
     * This Java function reads a dictionary file and returns its contents as an ArrayList of strings.
     * 
     * @return An ArrayList of Strings containing the words from a dictionary file.
     */
    public ArrayList<String> readDictionary(){
        
        ArrayList<String> fileArrayList = new ArrayList<>();
        String fileString = dictionaryFile;
        
        try {
            FileReader fileReader = new FileReader(fileString);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                fileArrayList.add(line);

            }
            
            bufferedReader.close();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return fileArrayList; 
    }

    /**
     * This function reads a file and returns its contents as an ArrayList of strings.
     * 
     * @return An ArrayList of Strings containing the lines read from a file.
     */
    public ArrayList<String> readTranslate(){
        
        ArrayList<String> fileArrayList = new ArrayList<>();
        String fileString = translateFile;
        
        try {
            FileReader fileReader = new FileReader(fileString);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                fileArrayList.add(line);

            }
            
            bufferedReader.close();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return fileArrayList; 
    }

    public String getDictionaryFile() {
        return dictionaryFile;
    }

    public void setDictionaryFile(String dictionaryFile) {
        this.dictionaryFile = dictionaryFile;
    }

    public String getTranslateFile() {
        return translateFile;
    }

    public void setTranslateFile(String translateFile) {
        this.translateFile = translateFile;
    }
}
