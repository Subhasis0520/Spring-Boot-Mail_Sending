package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.mail.EmailService;

@Service
public class MailServiceImp implements MailService{

	@Autowired
	private EmailService mail;
	
	
	@Override
	public boolean sendMail() {
		String to = "subhasisghoshgopi@gmail.com";
		String sub = "Mail Sending";
		String text = "Mail sending using Spring-Boot application";
		mail.sendSimpleMessage(to, sub, text);
		
		return true;
	}

}
