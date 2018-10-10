/**
 * 
 */
package com.surith.metro.model;

import com.surith.metro.MetroSystemException;
import com.surith.metro.db.Stations;

/**
 * @author kxhb130
 *
 */
public class SmartCard {

	private final int id;
	private final String name;
	private double balance = 50;
	private Stations station;
	private SwipeType status;

	/**
	 * @param id
	 * @param name
	 * @param balance
	 * @param station
	 * @param status
	 * @throws MetroSystemException 
	 */
	public SmartCard(int id, String name, double balance, Stations station, SwipeType status) throws MetroSystemException {
		validateSmartCard(name, station, status);
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.station = station;
		this.status = status;
	}

	/**
	 * @param id
	 * @param name
	 * @param station
	 * @param status
	 * @throws MetroSystemException 
	 */
	public SmartCard(int id, String name, Stations station, SwipeType status) throws MetroSystemException {
		validateSmartCard(name, station, status);
		this.id = id;
		this.name = name;
		this.station = station;
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @return the station
	 */
	public Stations getStation() {
		return station;
	}

	/**
	 * @return the status
	 */
	public SwipeType getStatus() {
		return status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SmartCard [id=");
		builder.append(id);
		builder.append(", ");
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		builder.append("balance=");
		builder.append(balance);
		builder.append(", ");
		if (station != null) {
			builder.append("station=");
			builder.append(station);
			builder.append(", ");
		}
		if (status != null) {
			builder.append("status=");
			builder.append(status);
		}
		builder.append("]");
		return builder.toString();
	}

	private void validateSmartCard(String name, Stations station, SwipeType status) throws MetroSystemException {
		if (name == null || name.isEmpty() || station == null || status == null) {
			throw new MetroSystemException("Not a valid card! Contact helpdesk");
		}
	}
}
