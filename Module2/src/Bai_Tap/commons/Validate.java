package Bai_Tap.commons;

public class Validate {
    public static boolean checkIdBenhAn(String id){
        String idBenhAn = "^BA-\\d{3}";
        return id.matches(idBenhAn);
    }
    public static boolean checkIdBenhNhan(String idBenhNhan){
        String id = "^BN-\\d{3}";
        return idBenhNhan.matches(id);
    }
    public static boolean checkday(String day){
        String dayRegex ="^(([0-2][0-9])|(30)|(31))\\/(([0][1-9])|([1][0-2]))\\/(([1][9][0-9)][0-9])|([2][0][0-2][0-1]))$";
        return day.matches(dayRegex);
    }
}
