package ds.maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValue {

	public static void main(String[] args) {
		int nums[] = {9,0,0,1,3,3,2,1,3,5,6,0};
        HashMap<Integer,Integer> counts = new LinkedHashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(counts.containsKey(nums[i])){
                int c = counts.get(nums[i]) + 1;
                counts.put(nums[i], c);
            }
            else {
                counts.put(nums[i],1);
            }
        }
        System.out.println("b4 sort");
        for(Map.Entry m:counts.entrySet()){
        	System.out.println(m.getKey() + " : " + m.getValue());
        }
        
        
        /*
        //Sort by KEY
        Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>(counts);

         */ 
        /*       
        //Sort by KEY:
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(counts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        	public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
        		return o2.getKey().compareTo(o1.getKey());
        	}
		});*/
        
        //Sort by VALUE:
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(counts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        	public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
        		return o2.getValue().compareTo(o1.getValue());
        	}
		});
        
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("after sort");
        for(Map.Entry m:sortedMap.entrySet()){
        	System.out.println(m.getKey() + " : " + m.getValue());
        }
        
        
	}
}
