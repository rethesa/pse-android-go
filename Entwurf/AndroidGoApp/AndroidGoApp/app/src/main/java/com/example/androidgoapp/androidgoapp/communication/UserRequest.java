package com.example.androidgoapp.androidgoapp.communication;

import com.example.androidgoapp.androidgoapp.model.objectStructure.SimpleUser;

/**
 * This can either be a request for creating a new user account,
 * or changing the name of an existing user.
 * If the sender is null but the userName is set we assume
 * it is a new user and create a new account.
 * @author tarek
 *
 */
public class UserRequest extends Request {
	private String userName;

	public UserRequest(SimpleUser sender) {
		super(sender);
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}
}
