package common;

import java.util.Calendar;
import java.util.Date;

public class Validate {
    private static String date = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static String validatePhoneCustomer(String phone) {
        String message = null;
        String regex = "^((\\(84\\)\\+)|(0))((91)|(90))[\\d]{7}$";
        if (!phone.matches(regex)){
            message = "Not ok. Phone not validate";
        }
        return message;
    }
    public static String validateCmndCustomer(String cmnd){
        String message = null;
        String regex = "^[\\d]{9}$";
        if (!cmnd.matches(regex)){
            message = "Not ok. Cmnd not validate";
        }
        return message;
    }
    public static String validateEmailCustomer(String email){
        String message = null;
        String regex = "^[A-Za-z_.0-9]+@[a-z]+.[a-z]+.[a-z]+$";
        if (!email.matches(regex)){
            message = "Not ok. Email not validate";
        }
        return message;
    }

//    public static String validateBirthday(String birthday){
//        String massage = null;
//        String dayRegex = "^(([0-2][0-9])|(30)|(31))\\/(([0][1-9])|([1][0-2]))\\/(([1][9][0-9)][0-9])|([2][0][0-2][0-1]))$";
//        if (!birthday.matches(dayRegex)){
//            if ((Integer.parseInt(birthday.substring(6, 10)) + 18) <= Calendar.getInstance().get(Calendar.YEAR)){
//                massage = "Not ok. Birthday not vallidate";
//            }
//        }
//        return massage;
//    }
}
