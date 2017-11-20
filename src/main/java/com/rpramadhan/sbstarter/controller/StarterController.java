package com.rpramadhan.sbstarter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rpramadhan.sbstarter.model.Response;
import com.rpramadhan.sbstarter.model.StarterMessage;

@RestController
public class StarterController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public ResponseEntity<Response> starterService() {
		Response resp = new Response();
		resp.setResponseCode("00");
		resp.setResponseDesc("success");
		resp.setResult(StarterMessage.createInstance("Hello World!"));
		return ResponseEntity.accepted().body(resp);
	}

}
