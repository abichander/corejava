package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> hash_map = new HashMap<>();//creating a hash table
        //insert record--->put
        hash_map.put("1", "Monday");
        hash_map.put("2", "Tuesday");
        hash_map.put("3", "Wednesday");
        hash_map.put("4", "Thursday");
        hash_map.put("5", "Friday");
       // Map<String, String> hash_map2 = new HashMap<>();
        
        Set<Entry<String, String>> entrySet = hash_map.entrySet();
        
        for (Entry<String, String> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    Map<String,String> hclone=(Map<String, String>) ((HashMap<String, String>) hash_map).clone();
    System.out.println("***"+hclone);
	}

}
