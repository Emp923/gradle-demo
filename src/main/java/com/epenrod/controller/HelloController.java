package com.epenrod.controller;

import com.epenrod.model.Greeter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String displayHomePage() {
        return "homePage";
    }

    @RequestMapping("/greeting")
    public String displayGreeting(HttpServletRequest request) {

        String name = request.getParameter("name");
        Greeter greeter = new Greeter(name);
        request.setAttribute("greeting", greeter.getGreeting());

        return "greeting";

    }

}
