package com.geekster.SendMailJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendMailJavaApplication {

	public static void main(String[] args) {

		// Prepare to send mails
		System.out.println("This application is supposed to send mails");


		HandleMail mailer = new HandleMail();
		mailer.sendMail();

	}

}
