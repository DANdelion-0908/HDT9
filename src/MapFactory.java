import java.util.TreeMap;

public class MapFactory {
    
    /**
     * The function creates and returns a specific type of tree data structure based on the input
     * mapNumber.
     * 
     * @param mapNumber The parameter "mapNumber" is an integer value that is used to determine which
     * type of tree data structure to create. It is passed as an argument to the "createMap" method.
     * @return The method is returning an instance of a data structure that implements the
     * IEstructuraArbol interface, depending on the value of the mapNumber parameter. It could be an
     * instance of ArbolRedBlack, ArbolSplay, or TreeMap. If the mapNumber is not recognized, the
     * method returns null.
     */
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
                System.out.println("Hash Map Tree creado. \n");
                TreeMap<String, String> treeMap = new TreeMap<>();
                return (IEstructuraArbol) treeMap;

            default:
            return null;
        }
    }
}
