package com.example.androidgoapp.androidgoapp.communication;


import com.example.androidgoapp.androidgoapp.model.objectStructure.SimpleUser;

public class UserResponse extends Response {
	private SimpleUser finalUser;
	
	public UserResponse(boolean success) {
		super(success);
	}

	public SimpleUser getFinalUser() {
		return finalUser;
	}

	public void setFinalUser(SimpleUser finalUser) {
		this.finalUser = finalUser;
	}
}
