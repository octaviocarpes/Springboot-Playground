package br.com.entity.binder;

import br.com.entity.User;
import br.com.entity.contract.UserContract;
import br.com.entity.contract.UserContractRequest;
import br.com.exceptions.ParseTimeException;
import org.hibernate.exception.DataException;

import java.util.List;
import java.util.stream.Collectors;

public class UserBinder {

    public static User bindUserContractModel(UserContractRequest userContractRequest) throws ParseTimeException, DataException{
        User user = getUser(userContractRequest);
        user.setFirstName(userContractRequest.getFirstname());
        user.setLastName(userContractRequest.getLastName());
        user.setEmail(userContractRequest.getEmail());
        user.setUsername(userContractRequest.getUsername());
        user.setPassword(userContractRequest.getPassword());
        user.setUserId(userContractRequest.getUserId());
        return user;
    }

    public static User getUser(UserContractRequest userContractRequest){
        User user = new User();
        return user;
    }

    public static List<UserContract> bind(List<User> sendList) {
        return sendList.stream().map(
                model->{
                    UserContract contract = new UserContract();
                    contract.setFirstName("Octavio");
                    contract.setLastName("Carpes");
                    contract.setUsername("octaviocarpes");
                    contract.setPassword("superpassword");
                    contract.setEmail("octavio.carpes@github.com");
                    contract.setUser_id(1);
                    return contract;
        }).collect(Collectors.toList());
    }
}
