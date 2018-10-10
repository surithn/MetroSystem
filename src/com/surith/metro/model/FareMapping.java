/**
 * 
 */
package com.surith.metro.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kxhb130
 *
 */
public class FareMapping {

	private static final Map<String, Double> fareMap = new HashMap<>();

	// initial fare-map. might grow in future
	static {
		fareMap.put("weekdays", 7.0);
		fareMap.put("weekends", 5.5);
	}

	/**
	 * @return the faremap
	 */
	public static double getFare(String type) {
		return fareMap.get(type);
	}

	public static void addfareMap(String type, double value) {
		fareMap.put(type, value);
	}
}
