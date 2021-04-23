package Commons;

public class ValidateService {
    public static boolean checkIdVilla(String id) {
        String idRegex = "^SVVL+-\\d{4}";
        return id.matches(idRegex);
    }

    public static boolean checkIDHouse(String id) {
        String idRegex = "^SVHO+-\\d{4}";
        return id.matches(idRegex);
    }

    public static boolean checkIDRoom(String id) {
        String idRegex = "^SVRO+-\\d{4}";
        return id.matches(idRegex);
    }

    public static boolean checkName(String name) {
        String nameRegex = "[A-Z]+[a-z]+";
        return name.matches(nameRegex);
    }

    public static boolean checkAreaUse(double areUse) {
        if (areUse > 30) {
            return true;
        }
        return false;
    }

    public static boolean checkCost(int cost) {
        if (cost > 0) {
            return true;
        }
        return false;
    }

    public static boolean checkAmount(int amount) {
        if (amount > 0 && amount < 20) {
            return true;
        }
        return false;
    }

    public static boolean checkFreeService(String free) {
        if (free.equalsIgnoreCase("massage") || free.equalsIgnoreCase("karaoke") || free.equalsIgnoreCase("food")
                || free.equalsIgnoreCase("drink") || free.equalsIgnoreCase("car")) {
            return true;
        }
        return false;
    }
    public static boolean checkNumberFloor(int number){
        if (number>0){
            return true;
        }return false;
    }
    public static boolean checkTypeRoom(String type) {
        String nameRegex = "[A-Z]+[a-z]+";
        return type.matches(nameRegex);
    }
}
