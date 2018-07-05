package zuul.eureka.poc.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "users")
    public String getAllUsers(){
        return "All Users";
    }
}
