import Exceptions.InvalidBirthdayException;
import Exceptions.InvalidDataException;
import Exceptions.InvalidGenderArgumentException;
import Exceptions.InvalidNumberException;

public class DataChecker {
    String[] arr;

    public static void checkData (String[] arr){
        try {
            if (arr.length != 6) throw new InvalidDataException();
            if (arr[3].length() != 10) throw new InvalidBirthdayException();
            if (!isNumber(arr[4])) throw new InvalidNumberException();
            if (!arr[5].equals("m") && !arr[5].equals("f")) throw new InvalidGenderArgumentException();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        
        
    }

    public static boolean isNumber(String number){
        if (number.length() != 9) return true;
        try {
            Long a = Long.parseLong(number);
            return false;
        } catch (Exception e) {
            return true;
        }
    
    }
}
