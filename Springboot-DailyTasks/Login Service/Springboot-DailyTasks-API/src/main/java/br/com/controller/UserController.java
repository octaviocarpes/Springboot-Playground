package br.com.controller;


import br.com.entity.User;

import br.com.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.util.List;


@RestController
@RequestMapping("users/v1/")
public class UserController {

    @Autowired
    UserService userService;

    private final Logger logger = LoggerFactory.getLogger(UserController.class);


    @RequestMapping("health")
    public String returnHealth(){
        return "Up!";
    }

    @RequestMapping(
            value = "allUsers",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> listUsers() {
        return userService.getAllUsers();
    }


    @PostMapping("api/createUser")
    public ResponseEntity<?> createUser(@RequestBody User user){

        userService.createUser(user);

        if (user != null){
            return new ResponseEntity("User Created!", new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity("Could not register User", new HttpHeaders(),HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody User login) {

        logger.debug("login : {}", login);

        //validate login here!

        return new ResponseEntity("Successfully login", new HttpHeaders(), HttpStatus.OK);

    }

}
