package map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMap {
public static void main(String[] args) {
	

Map<Integer,String> map=new HashMap<Integer,String>();
map.put(121,"6");
map.put(14,"5");
map.put(111,"4");

for (Map.Entry<Integer,String> set :
    map.entrySet()) {
	set.getKey();
	
}

for(Integer key: map.keySet()) {
System.out.println(key);
System.out.println(map.get(key));

}

for(Integer key: map.keySet()) {
System.out.println(key);
System.out.println(map.get(key));

}

Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
while(itr.hasNext()) {
	Map.Entry<Integer,String> ent=itr.next();
	System.out.println(ent.getKey());
	System.out.println(ent.getValue());
}
map.forEach((k,v) -> System.out.println("Key = "
        + k + ", Value = " + v));

List<Map.Entry<Integer,String>> list=new LinkedList<Map.Entry<Integer,String>>(map.entrySet());
Collections.sort(list,new Comparator<Map.Entry<Integer,String>>(){

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		// TODO Auto-generated method stub
		//return o1.getKey().compareTo(o2.getKey());
		//return o1.getValue().compareTo(o2.getValue());
		if(o1.getValue()==o2.getValue()) 
			return o1.getKey().compareTo(o2.getKey());
	
		else return o1.getValue().compareTo(o2.getValue());
	}
});
	
}

}
