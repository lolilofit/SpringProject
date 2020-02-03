package mainPack.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.Registration;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    private UserRepository userRepository;

    @Autowired
    public RegistrationController(UserRepository userRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String register() {
        return "registration";
    }

    @PostMapping
    public String getRegister(RegistrationForm form) {
        userRepository.save(form.toUserAut());
        return "redirect:/login";
    }
}
