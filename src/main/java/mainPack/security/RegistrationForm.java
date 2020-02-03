package mainPack.security;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {
    private String username;
    private String password;

    public UserAut toUserAut() {
        return new UserAut(username, password);
    }
}
