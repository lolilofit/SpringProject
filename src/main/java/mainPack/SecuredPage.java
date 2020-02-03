package mainPack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secured")
public class SecuredPage {

    @GetMapping
    public String doGet() {
        return "secured";
    }
}
