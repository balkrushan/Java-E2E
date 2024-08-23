package Collection;

import java.util.HashMap;
import java.util.Map;

public class hasmapproblem {
	
public static void main(String[] args) {
	
	Map<String,Integer> map=new HashMap<>();
	
	map.put("asset", 10);
	map.put("RDR",20);
	map.put("AHU",30);
	
	for(String key:map.keySet()){
	System.out.println(key);
		
	}
	
	for(Map.Entry m:map.entrySet()) {
		
		System.out.println(m.getKey()+":"+m.getValue());
	}
}
}
