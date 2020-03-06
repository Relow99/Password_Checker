import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void passwordCheck() {
        assertThrows(Exception.class, () -> {
            PasswordChecker.passwordIsValid("");
        });


    }
}