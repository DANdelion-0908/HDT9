import java.util.TreeMap;

public class MapFactory {
    
    public IEstructuraArbol createMap(int mapNumber) {
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
            System.out.println("TreeMap creado. \n");
                TreeMap<String, String> treeMap = new TreeMap<>();
                return (IEstructuraArbol) treeMap;

            default:
            return null;
        }
    }
}
