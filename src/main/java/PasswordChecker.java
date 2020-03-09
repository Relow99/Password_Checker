
public class PasswordChecker {

    public static void passwordIsValid(String password) throws Exception {

        String lowerCase = ".*[a-z].*";
        String upperCase = ".*[A-Z].*";
        String digit = ".*[0-9].*";
        String specialChars = "(.*[^0-9,a-z,A-Z].*)";
        int counter = 0;

        if (password.isEmpty()) {
            throw new Exception("password should exist");
        }
        if (password.length() < 8) {


            throw new Exception("password should be longer than than 8 characters");

        }
        if (!password.matches(lowerCase)) {
            counter++;
            System.out.println("password should have at least one lowercase letter");
//            throw new Exception("password should have at least one lowercase letter");

        }
        if (!password.matches(upperCase)) {
            counter++;
            System.out.println("password should have at least one uppercase letter");
//            throw new Exception("password should have at least one uppercase letter");

        }
        if (!password.matches(digit)) {
            counter++;
            System.out.println("password should at least have one digit");
//            throw new Exception("password should at least have one digit");
        }
        if (!password.matches(specialChars)) {
            counter++;
            System.out.println("password should have at least one special character");
//            throw new Exception("password should have at least one special character");

        }

        if (counter == 1)
        {
            System.out.println("Password is OK");
        }
        else{
            System.out.println("password is successful");
        }

    }


    }


