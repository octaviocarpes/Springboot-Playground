package br.com.controller;


import br.com.entity.User;
import br.com.entity.UserResponse;
import br.com.entity.binder.UserBinder;
import br.com.entity.contract.UserContractRequest;
import br.com.exceptions.ParseTimeException;
import br.com.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import java.util.Date;
import javax.servlet.ServletException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("users/v1/")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(
            value = "createUser",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<UserResponse>> createUser(
            @RequestBody
            @Valid
            UserContractRequest userContractRequest,
            BindingResult bindingResult
    ) throws ParseTimeException, DataException{
        if (bindingResult.hasErrors()){

            List<UserResponse> errors = new ArrayList<>();
            for (int i = 0; i < bindingResult.getAllErrors().size() ; i++) {
                UserResponse userResponse = new UserResponse();
                userResponse.setMessage(bindingResult.getAllErrors().get(i).getDefaultMessage());
                errors.add(i,userResponse);
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
        }

        userService.createUser(UserBinder.bindUserContractModel(userContractRequest));
        List<UserResponse> successList = new ArrayList<>();
        UserResponse userResponse = new UserResponse();
        userResponse.setMessage("User Registered!");
        successList.add(userResponse);
        return ResponseEntity.status(HttpStatus.OK).body(successList);
    }

    @RequestMapping(
            value = "allUsers",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> listUsers(){
        return userService.getAllUsers();
    }


    @RequestMapping(
            value = "login",
            method = RequestMethod.POST)
    public String login(@RequestBody User login) throws ServletException {

        String jwtToken = "";

        if (login.getEmail() == null || login.getPassword() == null) {
            throw new ServletException("Please fill in username and password");
        }

        String email = login.getEmail();
        String password = login.getPassword();

        User user = userService.findByEmail(email);

        if (user == null) {
            throw new ServletException("User email not found.");
        }

        String pwd = user.getPassword();

        if (!password.equals(pwd)) {
            throw new ServletException("Invalid login. Please check your name and password.");
        }

        jwtToken = Jwts.builder().setSubject(email).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();

        return jwtToken;
    }

    @RequestMapping("home")
    public String sendHomePage(){
        return "Home Page!";
    }
}
