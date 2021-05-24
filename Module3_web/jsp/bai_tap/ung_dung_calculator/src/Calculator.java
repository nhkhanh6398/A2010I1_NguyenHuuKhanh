public class Calculator {

    public static float caculate(float numberone , float numbertwo, char operator){
        switch (operator){
            case '+' :
                return  numberone + numbertwo;
            case '-' :
                return  numberone- numbertwo;
            case '*' :
                return numberone * numbertwo;
            case '/' :
                if (numbertwo != 0 ){
                    return numberone / numbertwo ;
                }
                else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
    }

