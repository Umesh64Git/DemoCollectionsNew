package com.velocity;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Dilip");
		map.put(2,"Rekha");
		map.put(3,"Rajesh");
		map.put(4,"Umesh");
		
		System.out.println(map);
	}

}
