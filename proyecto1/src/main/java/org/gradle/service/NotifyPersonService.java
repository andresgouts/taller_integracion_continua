package org.gradle.service;

import org.gradle.domain.Person;

public class NotifyPersonService {
	
	private EmailService emailService;

	public NotifyPersonService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public String notify(Person person) {
		String message = "Buen dia " + person.getName() + " " +  person.getLastName();
		return emailService.sendMail(message);
	}
	
	

}
