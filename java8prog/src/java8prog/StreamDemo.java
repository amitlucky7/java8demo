package java8prog;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("amit", 4);
		map.put("harsh", 3);
		map.put("jaya", 1);
		map.put("rahul", 2);
		
		arrangeOrder(map);
		//calling one more method below
	}

	private static void arrangeOrder(Map<String, Integer> map) {

		
		List<Map.Entry<String, Integer>> list = map.entrySet().stream().sorted((i1,i2)->-i1.getValue().compareTo(i2.getValue())).collect(Collectors.toList());
		list.forEach(i->System.out.println(i.getKey()+":"+i.getValue()));
	}
}
