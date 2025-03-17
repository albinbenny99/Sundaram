package CollectionsPractices;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {


    public static void main(String[] args) {
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(1,"bhanubhai");
        mp.put(null,null);
        mp.put(3,"chinna");
//        mp.remove(null);
        System.out.println(mp.containsKey(null));
        System.out.println(mp.containsValue("bhanubhai"));
        System.out.println(mp);
        System.out.println( mp.get(null));
        System.out.println(mp.size());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        for(Map.Entry<Integer,String> p:mp.entrySet()){
            System.out.println(p.getKey());

        }

    }
}
