package com.sending.mail.services;

import com.sending.mail.services.models.EmailDTO;
import jakarta.mail.MessagingException;

public interface IEmailService {
    public  void sendMail(EmailDTO email) throws MessagingException;
}
