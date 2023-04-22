import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class Tests {
    MapFactory mapFactory = new MapFactory();

    @Test

    public void rbTestInsert() {
        IEstructuraArbol<String> RBT = mapFactory.createMap(1);
        
        RBT.add("Hola");
        String rBTString = RBT.get("Hola");
        
        assertEquals("Hola", rBTString);
    }
    
    @Test
    
    public void stTestInsert() {
        IEstructuraArbol<String> ST = mapFactory.createMap(2);
        
        ST.add("Hola");
        String stString = ST.get("Hola");
        
        assertEquals("Hola", stString);
    }
    
    @Test
    
    public void tmTestInsert() {
        IEstructuraArbol<String> TM = mapFactory.createMap(3);

        TM.add("Hola");
        String TMString = TM.get("Hola");
        
        assertEquals("Hola", TMString);

    }
    
}
