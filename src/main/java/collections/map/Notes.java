package collections.map;

public class Notes {
    /*
    *
    * K = Key
    * V = Value
    *
    *
    * Handles key/value pairs
    * CANNOT contain duplicate keys
    *
    *
    * //Basic operations
    * V put(K key, V value);
    * V get(Object key);
    * V remove(Object key);
    * boolean containsKey(Object key);
    * boolean containsValue(Object value);
    * int size();
    * boolean isEmpty();
    *
    * //Bulk operations
    * void putAll(Map<? extends K, ? extends V> m);
    * void clear();
    *
    * //Collection Views
    * public Set<K> keySet();
    * public Collection<V> values();
    * public Set<Map.Entry<K,V> entrySet();
    *
    * //Interface for entrySet elements
    * public interface Entry {
    *   K getKey();
    *   V getValue();
    *   V setValue(V value);
    * }
    *
    *
    *
    * SortedMap - maintains mappings in ascending key order (ex dictionary or telephone directory)
    * HashMap - Use if you want max speed and dont care about iteration order
    * TreeMap - Use when key-order collection is wanted/needed
    * LinkedHashMap - If you want both hashmap performance and insertion order iteration
    *
    *
    * */
}
