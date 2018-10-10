/**
 * 
 */
package com.surith.metro.service;

import com.surith.metro.MetroSystemException;
import com.surith.metro.db.Stations;
import com.surith.metro.db.TripHolder;
import com.surith.metro.model.SmartCard;
import com.surith.metro.model.SwipeType;

/**
 * @author kxhb130
 *
 */
public class SwipeInService extends Executor {

	@Override
	public void swipeIn(int id, String name, Stations st, SwipeType wt) throws MetroSystemException {
		SmartCard sc1 = new SmartCard(id, name, st, wt);
		TripHolder.addTrip(sc1);
	}
}
