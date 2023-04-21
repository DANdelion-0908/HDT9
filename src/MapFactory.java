import java.util.TreeMap;

public class MapFactory<T> {
    
    public IEstructuraArbol createMap(int mapNumber) {
        switch (mapNumber) {
            case 1:
                ArbolRedBlack redBlack = new ArbolRedBlack();
                return redBlack;
            
            case 2:
                ArbolSplay splay = new ArbolSplay<>();
                return splay;

            case 3:
                TreeMap treeMap = new TreeMap<>();
                return (IEstructuraArbol) treeMap;

            default:
            return null;
        }
    }
}
