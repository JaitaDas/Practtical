package CollectionEg;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapDemo {
	
	public static void main(String[] args) {
		
LinkedHashMap<Integer,String> lhm = new	LinkedHashMap<Integer,String>();
//adding elements
lhm.put(200, "riya");
lhm.put(205, "priya");
lhm.put(202, "rima");
lhm.put(201, "rohit");
//key
System.out.println("keys are:"+ lhm.keySet());
//values
System.out.println("values are:"+ lhm.values());
//key-value pair
System.out.println("keys-values pairs are:"+ lhm.entrySet());

lhm.remove(lhm);
//traversing
for(Map.Entry m: lhm.entrySet()) {
	System.out.println(m.getKey()+""+m.getValue());
}
	}

}
