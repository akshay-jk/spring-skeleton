package com.springapi.service;

import com.springapi.dto.UserDTO;
import com.springapi.entity.User;
import com.springapi.entitydao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao UserDataAccessObject;

    public User GetUser(int Id) {
        return UserDataAccessObject.findById(Id).get();
    }

    public List<User> GetUsers() {
        return UserDataAccessObject.findAll();
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
