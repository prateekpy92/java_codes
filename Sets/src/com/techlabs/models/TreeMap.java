package com.techlabs.models;
import java.util.Map;
import java.util.Set;

public class TreeMap{
    public static void main(String[] args) {
    	TreeMap map = new TreeMap();
        
        map.put(1, "lmn");
        map.put(2, "xyz");
        map.put(3, "pqr");
        
        Set<Map.Entry<Integer, String>> entries = ((Map) map).entrySet();
        
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " ---- " + entry.getValue());
        }
        
      
         System.out.println(map);
    }

	private void put(int i, String string) {
		// TODO Auto-generated method stub
		
	}
}