package com.amycardoso.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.amycardoso.cursomc.domain.Cliente;
import com.amycardoso.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
