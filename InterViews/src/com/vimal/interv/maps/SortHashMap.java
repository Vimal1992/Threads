package com.vimal.interv.maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		Map<Integer, String> unsortedMap = new TreeMap<Integer, String>(
		        (Comparator<Integer>) (i1, i2) -> i2.compareTo(i1));
		// Press Ctrl+Alt+Arrow Down key for select and paste in next line
		populateMap(unsortedMap);
		Map<Integer, String> nMap = sortByValue(unsortedMap);
		for (Map.Entry<Integer, String> uMap : nMap.entrySet()) {
			System.out.println("KEY --> " + uMap.getKey() + "  Value -->  "
			        + uMap.getValue());
		}
		Integer Integer = 10;
	}

	private static Map<Integer, String> sortByValue(
	        Map<Integer, String> unsortedMap) {
		List<Entry<Integer, String>> sortSet = new LinkedList<Entry<Integer, String>>(
		        unsortedMap.entrySet());
		Collections.sort(sortSet, (Comparator<Entry<Integer, String>>) (o1,
		        o2) -> o1.getValue().compareTo(o2.getValue()));

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> sortedSet : sortSet) {
			map.put(sortedSet.getKey(), sortedSet.getValue());
		}
		return map;
	}

	private static void populateMap(Map<Integer, String> unsortedMap) {
		unsortedMap.put(1, "Shyam");
		unsortedMap.put(2, "Bhola");
		unsortedMap.put(8, "Narang");
		unsortedMap.put(7, "Ganesh");
		unsortedMap.put(3, "Dida");
		unsortedMap.put(6, "Rahul");
		unsortedMap.put(4, "Nathan");
		unsortedMap.put(5, "Manish");

	}

}
