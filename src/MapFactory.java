import java.util.TreeMap;

public class MapFactory {
    
    public IEstructuraArbol createMap(int mapNumber) {

        IKeyGenerator myExtractor = new ObtenerLlaveDesdePalabra();

        switch (mapNumber) {
            case 1:
                System.out.println("Red-Black Tree creado. \n");
                ArbolRedBlack<String> redBlack = new ArbolRedBlack<>();
                return redBlack;
            
            case 2:
                System.out.println("Splay Tree creado. \n");
                ArbolSplay<String> splay = new ArbolSplay<>();
                return splay;

            case 3:
                System.out.println("Hash Map Tree creado. \n");
                ArbolHashMap<String, String> hashMap = new ArbolHashMap<>(myExtractor);
                return hashMap;

            default:
            return null;
        }
    }
}
