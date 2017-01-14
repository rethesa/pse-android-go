package com.example.androidgoapp.androidgoapp.communication;

import com.example.androidgoapp.androidgoapp.model.objectStructure.GroupClient;
import com.example.androidgoapp.androidgoapp.model.objectStructure.Link;
import com.example.androidgoapp.androidgoapp.model.objectStructure.SimpleUser;

public class GroupRequest extends Request {
	private String targetGroup;
	private Link inviteLink;
	
	public GroupRequest(SimpleUser sender) {
		super(sender);
	}

	public String getTargetGroup() {
		return targetGroup;
	}

	public void setTargetGroup(GroupClient targetGroup) {
		this.targetGroup = targetGroup.getGroupName();
	}

	public Link getInviteLink() {
		return inviteLink;
	}

	public void setInviteLink(Link inviteLink) {
		this.inviteLink = inviteLink;
	}

}
