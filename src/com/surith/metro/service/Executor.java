/**
 * 
 */
package com.surith.metro.service;

import com.surith.metro.MetroSystemException;
import com.surith.metro.db.Stations;
import com.surith.metro.model.SwipeType;

/**
 * @author kxhb130
 *
 */
public abstract class Executor {

	public abstract void swipeOut(int id, Stations st) throws MetroSystemException;

	public abstract void swipeIn(int id, String name, Stations st, SwipeType wt) throws MetroSystemException;
}
