package br.com.entity.binder;

import br.com.entity.User;
import br.com.entity.contract.UserContract;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserBinderTest {

    //TODO Finish those tests!
    @Test
    public void verifyUsername(){
        //Given
        User user = new User();
        user.setUsername("Octavio");
        List<User> sendList = new ArrayList<>();
        sendList.add(user);

        //When
        List<UserContract> revicenContracts = UserBinder.bind(sendList);


    }

    @Test
    public void verifyPassword(){

    }

    @Test
    public void verifyFirstName(){

    }

    @Test
    public void verifyLastName(){

    }

    @Test
    public void verifyUserEmail(){

    }

    @Test
    public void verifyUserId(){

    }

}