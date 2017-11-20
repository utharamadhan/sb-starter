package com.rpramadhan.sbstarter.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StarterMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6358381915366283196L;
	
	public static StarterMessage createInstance(String message) {
		StarterMessage starterMessage = new StarterMessage();
		starterMessage.setMessage(message);
		return starterMessage;
	}
	
	@JsonProperty("message")
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
