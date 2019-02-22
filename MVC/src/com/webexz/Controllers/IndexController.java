package com.webexz.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/showFormulario")
    public String showFormulario() {
        return "formulario";
    }

    @RequestMapping("/processFormulario")
    public String processFormulario() {
        return "home";
    }
}
