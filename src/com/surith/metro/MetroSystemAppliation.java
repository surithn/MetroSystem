/**
 * 
 */
package com.surith.metro;

import com.surith.metro.db.Stations;
import com.surith.metro.model.SmartCard;
import com.surith.metro.model.SwipeType;
import com.surith.metro.service.Executor;
import com.surith.metro.service.SwipeInService;

/**
 * @author kxhb130
 *
 */
public class MetroSystemAppliation {

	/**
	 * @param args
	 * @throws MetroSystemException
	 */
	public static void main(String[] args) throws MetroSystemException {
		
		Executor exe;
		try {
			exe = new SwipeInService();
			exe.swipeIn(sc1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
