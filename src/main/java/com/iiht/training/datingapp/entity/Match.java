package com.iiht.training.datingapp.entity;

public class Match {

	
	private Long id;
	private Long userId;
	private Long matchedUserId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMatchedUserId() {
		return matchedUserId;
	}

	public void setMatchedUserId(Long matchedUserId) {
		this.matchedUserId = matchedUserId;
	}
}
