package common;

public class Validate {
    public static String ValidateEmail(String email){
        String message = null;
        String regex = "^[A-Za-z_.0-9]+@[a-z]+.[a-z]+.[a-z]+$";
        if (!email.matches(regex)){
            message = "Not ok! Please input";
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
    public static String validateRent(int rent){
        String message = null;
        if (rent<1000000){
            message = "Not! rent>= 1.000.000";
        }
        return message;
    }
    public static String validateArea(int area){
        String message = null;
        if (area<20){
            message = "Not! area >=20";
        }
        return message;
    }
    public static String validateId(String id){
        String message = null;
        String regex = "^[0-9A-Z]{3}+-[0-9A-Z]{2}+-[0-9A-Z]{2}$";
        if (!id.matches(regex)){
            message = "Not ok. ID not XXX-XX-XX ";
        }
        return message;
    }
}
