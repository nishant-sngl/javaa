package ds.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		map1();
	}
	
	public static void map1(){
		HashMap<String, Double> map = new HashMap<String, Double>();
        
        //Adding some elements to HashMap
         
        map.put("Ashwin", 87.55);
         
        map.put("Bharat", 95.65);
         
        map.put("Chetan", 68.13);
         
        map.put("Dhanjay", 74.23);
         
        map.put("Kartik", 65.42);
         
        //HashMap can have one null key and multiple null values
         
        map.put(null, null);
         
        map.put("Sandesh", null);
        
        Set set = map.keySet();
        
        Iterator itSet = set.iterator();
        
        while(itSet.hasNext()){
        	Object key = itSet.next();
        	System.out.println(key + " : " + map.get(key));
        }
        System.out.println("NEWWWW");
        map.replace("Kartik", 65.11);
        
        set = map.keySet();
        
        itSet = set.iterator();
        while(itSet.hasNext()){
        	Object key = itSet.next();
        	System.out.println(key + " : " + map.get(key));
        }
        
        System.out.println("collection");
        Collection<Double> list = map.values();
        for(Double d:list){
        	System.out.println(d);
        }
        
        /*for(Map.Entry m: map.entrySet()){
        	System.out.println(m.getKey() + " : " + m.getValue());
        }
        
        Iterator itMap = map.entrySet().iterator();
        while(itMap.hasNext()){
        	System.out.println(itMap.next());
        }
        
        System.out.println("Does this map has Chetan as key? "+ map.containsKey("Chetan"));
        System.out.println("Does this map has 74.23 as value? " + map.containsValue(74.2));
		}
	*/
       
        Collections.sort(list, new Comparator<Map<String, Double>>() {

			@Override
			public int compare(Map<String, Double> o1, Map<String, Double> o2) {
				// TODO Auto-generated method stub
				return (o1.get(key));
			}
		});
    }
}
