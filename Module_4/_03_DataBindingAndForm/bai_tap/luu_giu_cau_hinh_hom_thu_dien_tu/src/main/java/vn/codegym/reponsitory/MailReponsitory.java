package vn.codegym.reponsitory;

import vn.codegym.model.Mail;

public interface MailReponsitory {
    Mail find();
    Mail updateMail (Mail mail);
}
