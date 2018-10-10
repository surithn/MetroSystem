package com.surith.metro.db;

import java.util.HashMap;
import java.util.Map;

import com.surith.metro.MetroSystemException;
import com.surith.metro.model.SmartCard;

public class TripHolder {

	private static final Map<Integer, SmartCard> tripHolder = new HashMap<>();

	public static void addTrip(SmartCard sc) throws MetroSystemException {
		SmartCard old = tripHolder.get(sc.getId());
		if (old != null && old.getId() == sc.getId()) {
			throw new MetroSystemException("Your trip has already started!");
		}
		tripHolder.put(sc.getId(), sc);
	}

	public static SmartCard getTrip(Integer id) {
		return tripHolder.get(id);
	}

	public static void endTrip(Integer id) throws MetroSystemException {
		SmartCard old = tripHolder.get(id);
		if (old != null && old.getId() == id) {
			tripHolder.remove(id);
		}
		throw new MetroSystemException("No Active trip found!");
	}
}
