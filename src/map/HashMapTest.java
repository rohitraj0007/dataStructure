package map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(121,"6");
	map.put(14,"5");
	map.put(111,"4");
	sortByKey(map);
	sortByKeyModified(map);
	sortByValue(map);
	System.out.println("map "+map);
	
	}

	private static void sortByKeyModified(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }

                });
		treeMap.putAll(map);
		System.out.println(treeMap);
	}


	private static void sortByValue(Map<Integer, String> map) {
		// Create a list from elements of HashMap
        List<Map.Entry<Integer, String> > list =
               new LinkedList<Map.Entry<Integer, String> >(map.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() {
            public int compare(Map.Entry<Integer, String> o1,
                               Map.Entry<Integer, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer,String> temp = new LinkedHashMap<Integer, String>();
        for (Map.Entry<Integer,String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println(temp);
	}

	private static void sortByKey(Map<Integer, String> unsortMap) {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(unsortMap);
        System.out.println(treeMap);
		
	}

}
