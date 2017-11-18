package com.rpramadhan.sbstarter.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class Response {
	
	@JsonProperty("responseCode")
	private String code;
	
	@JsonProperty("responseDesc")
	private String message;
	
	@JsonProperty("result")
	private Object result;
	
	@JsonProperty("errors")
	private List<ErrorHolder> errors;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	public List<ErrorHolder> getErrors() {
		return errors;
	}
	public void setErrors(List<ErrorHolder> errors) {
		this.errors = errors;
	}
	
}
