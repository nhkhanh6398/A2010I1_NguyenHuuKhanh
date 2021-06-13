package vn.codegym.reponsitory;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import vn.codegym.model.Mail;

@Repository
public class MailReponsitoryImpl implements MailReponsitory {
    Mail mail = new Mail("Vietnamese",5, new String[]{"1"},"Thor" +"\n"+
            "King,Asgard");

    @Override
    public Mail find() {
        return mail;
    }

    @Override
    public Mail updateMail(Mail mail) {
        Mail mail1 = new Mail();
        mail1.setLanguage(mail.getLanguage());
        mail1.setSize(mail.getSize());
        mail1.setCheck(mail.getCheck());
        mail1.setTextAra(mail.getTextAra());
        return mail1;
    }
}
