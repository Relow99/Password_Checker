import java.util.Scanner;

public class MainPassword {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your password");
        String password = scanner.nextLine();
        try {
            System.out.println(PasswordChecker. passwordIsValid(password));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(PasswordChecker.passwordIsOk(password));
    }
}