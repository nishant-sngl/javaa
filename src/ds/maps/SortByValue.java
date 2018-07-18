package ds.maps;

import java.util.HashMap;

public class SortByValue {

	public static void main(String[] args) {
		int nums[] = {0,0,0,1,3,3,2,1,3,5,6,0};
        HashMap<Integer,Integer> counts = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) {
            if(counts.containsKey(nums[i])){
                int c = counts.get(nums[i]) + 1;
                counts.put(nums[i], c);
            }
            else {
                counts.put(nums[i],1);
            }
        }
        
	}
}
