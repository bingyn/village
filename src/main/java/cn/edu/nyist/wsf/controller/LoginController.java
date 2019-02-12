package cn.edu.nyist.wsf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class LoginController {
    @RequestMapping("/test")
    public String show(Model model) {
        model.addAttribute("name", "Dear");
        return "index";
    }
}
    