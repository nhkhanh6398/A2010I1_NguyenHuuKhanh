package Commons;

import java.util.Calendar;

public class ValidateCustomer {
    public static boolean checkMail(String email) {
        String emailFormat = "^[A-Za-z_.0-9]+@[a-z]+.[a-z]+.[a-z]+$";
        return email.matches(emailFormat);
    }

    public static boolean checkName(String name) {
        String nameRegex = "^[A-Z]{1}[a-z]+(\\s[A-Z]{1}[a-z]*)*$";
        return name.matches(nameRegex);
    }
    public static boolean checkDay(String day) throws ExceptionBirthDay {
        String dayRegex = "^(([0-2][0-9])|(30)|(31))\\/(([0][1-9])|([1][0-2]))\\/(([1][9][0-9)][0-9])|([2][0][0-2][0-1]))$";
        if (day.matches(dayRegex)){
           if ((Integer.parseInt(day.substring(6, 10)) + 18) <= Calendar.getInstance().get(Calendar.YEAR)){
               return true;
           }
        }
        throw new ExceptionBirthDay();

    }
    public static boolean checkGender(String type){
        if
            (type.equals("Male" )|| type.equals("Female")  || type.equals("Unknow") ) {
            return true;
        }
        return false;
    }

    public static boolean checkCmndCustomer(String cmnd){
        String cmndRegex = "\\d{3}\\s\\d{3}\\s\\d{3}";
        return cmnd.matches(cmndRegex);
    }


}

