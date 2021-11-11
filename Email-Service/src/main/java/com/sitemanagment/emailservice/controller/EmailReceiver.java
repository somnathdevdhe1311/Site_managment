package com.sitemanagment.emailservice.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class EmailReceiver {

	@Autowired
	private JavaMailSender javaMailSender;

	@RabbitListener(queues = "passwordChangeQ")
	public void balanceInquiry(String bankMsg) {
		System.out.println("===========> Password changed:: ****====**** <===========");
		System.out.println(bankMsg);

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("somnathdevdhe1311@gmail.com");

		msg.setSubject("Your password has changed");
		msg.setText(bankMsg);

		javaMailSender.send(msg);
	}

	@RabbitListener(queues = "withdrawEmailQ")
	public void withdraw(String bankMsg) {
		System.out.println("===========> Withdraw Amount:: ****====**** <===========");
		System.out.println(bankMsg);

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("somnathdevdhe1311@gmail.com");

		msg.setSubject("Withdraw amount from your account");
		msg.setText(bankMsg);

		javaMailSender.send(msg);
	}

	@RabbitListener(queues = "depositeEmailQ")
	public void deposite(String bankMsg) {
		System.out.println("===========> Deposited Amount:: ****====**** <===========");
		System.out.println(bankMsg);

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("somnathdevdhe1311@gmail.com");

		msg.setSubject("Deposited amount successfully in your account");
		msg.setText(bankMsg);

		javaMailSender.send(msg);
	}

	@RabbitListener(queues = "transferEmailQ")
	public void transfer(String bankMsg) {
		System.out.println("===========> Fund Transfer:: ****====**** <===========");
		System.out.println(bankMsg);

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("somnathdevdhe1311@gmail.com");

		msg.setSubject("Fund transfer successfully");
		msg.setText(bankMsg);

		javaMailSender.send(msg);
	}

}
