package com.springapi.service;

import com.springapi.dto.UserDTO;
import com.springapi.entity.User;
import com.springapi.entitydao.UserDao;
import com.springapi.exception.RequestedResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao UserDataAccessObject;
    private String URL = "https://jsonplaceholder.typicode.com/";

    public List<User> GetUsers() {
        return UserDataAccessObject.findAll();
    }

    public User GetUser(int Id) {
        try {
            return UserDataAccessObject.findById(Id).get();
        } catch (Exception ex) {
            throw new RequestedResourceNotFound();
        }
    }

    public User SaveUser(UserDTO UserDetails) {
        return UserDataAccessObject.save(
                User.builder()
                        .Id(UserDetails.getId())
                        .Name(UserDetails.getName())
                        .Age(UserDetails.getAge())
                        .MotherTongue(UserDetails.getMotherTongue())
                        .build()
        );
    }
}
