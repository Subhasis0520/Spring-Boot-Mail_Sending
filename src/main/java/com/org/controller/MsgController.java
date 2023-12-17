package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.service.MailService;

@RestController
public class MsgController {

	@Autowired
	private MailService mail;
	
	@GetMapping("/mail")
	public String sendMail() {
		mail.sendMail();
		return "Mail Send Successfully";
	}
	
}
