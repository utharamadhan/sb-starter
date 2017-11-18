package com.rpramadhan.sbstarter.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorHolder implements Serializable{

	private static final long serialVersionUID = -176523424639609289L;
	
	@JsonProperty("errorCode")
	private String errorCode;
	
	@JsonProperty("errorMessage")
	private String errorMessage;
	
	@JsonIgnore
	private String fieldName;
	
	public static ErrorHolder newInstance(String errorCode, String errorMessage) {
		ErrorHolder obj = new ErrorHolder();
			obj.setErrorCode(errorCode);
			obj.setErrorMessage(errorMessage);
		return obj;
	}
	
	public static ErrorHolder newInstance(String fieldName, String errorCode, String errorMessage) {
		ErrorHolder obj = new ErrorHolder();
			obj.setFieldName(fieldName);
			obj.setErrorCode(errorCode);
			obj.setErrorMessage(errorMessage);
		return obj;
	}
	
	public static ErrorHolder newGeneralErrorInstance(String errorMessage) {
		ErrorHolder obj = new ErrorHolder();
			obj.setErrorCode("99");
			obj.setErrorMessage(errorMessage);
		return obj;
	}

	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
}
