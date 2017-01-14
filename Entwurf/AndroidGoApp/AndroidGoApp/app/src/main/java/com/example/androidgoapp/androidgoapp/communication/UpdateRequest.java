package com.example.androidgoapp.androidgoapp.communication;

import com.example.androidgoapp.androidgoapp.model.objectStructure.SimpleUser;

import java.util.LinkedList;



public class UpdateRequest extends Request {
	public UpdateRequest(SimpleUser sender) {
		super(sender);
		// TODO Auto-generated constructor stub
	}


	private LinkedList<String> targetGroupsNames;
	

	public LinkedList<String> getGroups() {
		return this.targetGroupsNames;
	}
}
