package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
* Note: can we store multiple key in hashmap -
 *     no if we try to insert duplicate key old value of that key will override by new value.
 *     in below approach we can store multiple value to single key.
* */

public class MultiValueMap {
    public static void main(String[] args) {
        HashMap<String, List<String>> multiValueMap = new HashMap<>();

        // Add values to the map
        addValue(multiValueMap, "key1", "value1");
        addValue(multiValueMap, "key1", "value2");
        addValue(multiValueMap, "key2", "value3");

        // Print the map
        System.out.println(multiValueMap);
        // Retrieve and print values for a specific key
        List<String> valuesForKey1 = getValues(multiValueMap, "key1");
        System.out.println("Values for key1: " + valuesForKey1);

        List<String> valuesForKey2 = getValues(multiValueMap, "key2");
        System.out.println("Values for key2: " + valuesForKey2);

        List<String> valuesForKey3 = getValues(multiValueMap, "key3");
        System.out.println("Values for key3: " + valuesForKey3);
        // This will be null or an empty list
    }
    private static void addValue(HashMap<String, List<String>> map, String key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    private static List<String> getValues(HashMap<String, List<String>> map, String key) {
        return map.get(key);
        // Returns the list of values associated with the key, or null if the key does not exist
    }
}

