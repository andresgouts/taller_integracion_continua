package org.gradle;

import org.gradle.domain.Person;
import org.gradle.service.EmailService;
import org.gradle.service.NotifyPersonService;
import org.gradle.testdatabuilder.PersonTestDataBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.Assert;

public class NotifyPersonServiceTest {
	
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup() {
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest() {
		//Arrange
		Person person = new PersonTestDataBuilder().whitName("julian").build();
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		System.out.println(message);
		Assert.assertNull(message);
	}
	
	
}
