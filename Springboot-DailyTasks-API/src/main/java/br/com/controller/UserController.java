package br.com.controller;


import br.com.entity.User;
import br.com.entity.UserResponse;
import br.com.entity.binder.UserBinder;
import br.com.entity.contract.UserContractRequest;
import br.com.exceptions.ParseTimeException;
import br.com.service.UserService;
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

}
