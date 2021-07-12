package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
public static void main(String[] args) {
	Coordinates c1=new Coordinates(1,2);
	Coordinates c3=new Coordinates(1,2);
	Set<Coordinates> set = new HashSet<>();
	List <Coordinates> list=new ArrayList<>();
	set.add(c1);
	set.add(c3);
	list.add(c1)
;
	list.add(c3);
	System.out.println(set);
	System.out.println(list);}
}
