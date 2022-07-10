package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
@SessionAttributes("loginStart")
public class SessionController {

    @GetMapping("login")
    @ResponseBody
    public String login(Model model, HttpSession session) {

        if (!model.asMap().containsKey("loginStart")) {
            LocalDateTime ldt = LocalDateTime.now();
            session.setAttribute("loginStart", ldt);
            return ldt.toString();
        }

        return model.asMap().entrySet()
                .stream()
                .filter(e -> e.getKey().equals("loginStart"))
                .findFirst()
                .get()
                .getValue()
                .toString();
    }
}
