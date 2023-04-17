import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Reader {
    
    private String file;

    
    public ArrayList<String> read(String file){
        
        ArrayList<String> fileArrayList = new ArrayList<>();
        String fileString = file;
        
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
    
    public String getFile() {
        return file;
    }
    
    public void setFile(String file) {
        this.file = file;
    }
}
