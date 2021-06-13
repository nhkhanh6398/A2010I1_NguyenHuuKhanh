package vn.codegym.service;

import vn.codegym.model.Mail;

public interface MailService {
    Mail updateMail (Mail mail);
    Mail find();
}
