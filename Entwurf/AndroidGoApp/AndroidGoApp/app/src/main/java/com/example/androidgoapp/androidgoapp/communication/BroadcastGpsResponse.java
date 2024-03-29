package com.example.androidgoapp.androidgoapp.communication;

import com.example.androidgoapp.androidgoapp.model.objectStructure.GpsObject;

import java.util.LinkedList;


/**
 * Response to broadcastGPSrequest. Contains the GPS-Data of other group members
 * @author tarek
 *
 */
public class BroadcastGpsResponse extends Response {
	private LinkedList<GpsObject> gpsData;

	public BroadcastGpsResponse(boolean success) {
		super(success);
		// TODO Auto-generated constructor stub
	}

	public LinkedList<GpsObject> getGpsData() {
		return gpsData;
	}

	public void setGpsData(LinkedList<GpsObject> gpsData) {
		this.gpsData = gpsData;
	}
}
