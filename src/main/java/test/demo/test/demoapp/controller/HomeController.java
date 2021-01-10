package test.demo.test.demoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/demo")
public class HomeController {
   /* private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Value("${messages.home:default-value}")
    private String message = "Welcome to Spring Boot Application";

    @RequestMapping("/test")
    public String welcome(Model model) {
        log.info("Spring Boot Thymeleaf Configuration Example");
        model.addAttribute("message", message);
        return "home";
    }
*/  // thymeleaf
    @RequestMapping("/home")
    public String index() {
        return "Greetings from Spring Boot!";
    }


}
