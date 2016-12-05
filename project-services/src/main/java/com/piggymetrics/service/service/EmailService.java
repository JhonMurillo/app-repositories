package com.piggymetrics.service.service;

import com.piggymetrics.service.domain.NotificationType;
import com.piggymetrics.service.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
