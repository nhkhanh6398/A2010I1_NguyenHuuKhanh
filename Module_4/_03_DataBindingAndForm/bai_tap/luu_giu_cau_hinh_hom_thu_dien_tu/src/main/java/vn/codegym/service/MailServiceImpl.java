package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Mail;
import vn.codegym.reponsitory.MailReponsitory;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    MailReponsitory mailReponsitory;
    @Override
    public Mail updateMail(Mail mail) {
        return mailReponsitory.updateMail(mail);
    }

    @Override
    public Mail find() {
        return mailReponsitory.find();
    }
}