package map;

import java.util.*;
import java.util.Map.Entry;

public class Map_Practice {

	public static void main(String[] args) {

		Map<Integer,String> m = new Hashtable<>(); //can use HashMap,TreeMap & LinkedHashMap instead of Hashtable. Difference lies in internal functionalitty

		m.put(101, "Hyderabad");
		m.put(102, "Chennai");
		m.put(103, "Banglore");
		m.put(104, "Kochi");

		//Retrieval of keys from the map
		Set<Integer> keys = m.keySet();
		
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		
		//Retrieval of Values from the map
		Collection<String> values = m.values();
		
		for(String value:values) {
			System.out.println(value);
		}
		
		//Retrieval based on key
		System.out.println(m.get(103)); //for specific key
		
		for(Integer key : keys) {
			System.out.println(key+" : "+m.get(key));
		}
		
		System.out.println(m);
		
		
		//Retrieval of keys & values using entrySet
		Set<Entry<Integer, String>> entries = m.entrySet();  //entrySet contains both keys and values
		
		for(Entry<Integer, String> entry : entries) {
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" -> "+value);
		}
		
		
		//Deletion
		m.remove(104);
		System.out.println(m);
		
		m.remove(103,"Banglore");  //m.remove(103,"ioui");  if incorrect value is given even though key is correct, it will not delete
		System.out.println(m);
		
//		m.clear();
//		System.out.println(m);
		
		//Searching
		
		System.out.println(m.containsKey(102));
		System.out.println(m.containsKey(1758));
		
		System.out.println(m.containsValue("Hyderabad"));
		System.out.println(m.containsValue("uiuoturykty"));
		
		
		//Updating
		
		m.put(101, "Vizag");
		System.out.println(m);
		
		m.putIfAbsent(101, "Vijayawada");  //checks whether the key is present or not, if present insertion will not takes place, otherwise inserts
		System.out.println(m);
		
		m.replace(101, "hi");  //if key is not there, nothing will happen
		System.out.println(m);
		
		
		//Other
		
		System.out.println(m.size());

	}

}
