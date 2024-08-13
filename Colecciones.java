import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Colecciones{
    public static void main(String[] args) {
        listas();
        sets();
        maps();
    }  
    public static void listas(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Hugo");
        nombres.add("paco");
         
        for(int i=0; i<nombres.size(); i++){
            System.out.println(nombres.get(i)); 
        }
    }
    public static void sets(){
        Set<String> nombres2 = new HashSet<>();
        nombres2.add("Hugo");
        nombres2.add("paco");

        Iterator<String> iteratorNombreSet = nombres2.iterator();
        while (iteratorNombreSet.hasNext()) {
            String nombre = iteratorNombreSet.next();
            System.out.println("nombre: "+nombre+" Hash: "+nombre.hashCode());
        }
    }
    public static void maps(){
        Map<String, Integer> nombres3 = new HashMap<String, Integer>();
        nombres3.put("Hugo",10);
        nombres3.put("paco",8);

        for(String key: nombres3.keySet()){
            Integer value = nombres3.get(key);
            System.out.println("nombre: "+key+" edad: "+value);
        }
    }
}