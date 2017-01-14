package com.example.androidgoapp.androidgoapp.communication;

import com.example.androidgoapp.androidgoapp.model.objectStructure.SimpleUser;

/**
 * @author tarek
 *
 */
public abstract class Request {
	private SimpleUser sender;
	
	/**
	 * Default constructor required by Jackson API
	 */
	public Request() {
		
	}
	public Request(SimpleUser sender) {
		this.sender = sender;
	}
	
	public SimpleUser getSender() {
		return this.sender;
	}
}
