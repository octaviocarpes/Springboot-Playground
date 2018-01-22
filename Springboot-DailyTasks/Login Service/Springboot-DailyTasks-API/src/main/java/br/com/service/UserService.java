package br.com.service;

import br.com.dao.UserDAO;
import br.com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public User getUser(String username, String password){
        return userDAO.getUser(username,password);
    }

    public List<User> getAllUsers(){
        return userDAO.getAllUsers();
    }

    public void createUser(User user){
         userDAO.insertUser(user);
    }

}
