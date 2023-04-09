package com.springapi.controller;

import com.springapi.dto.UserDTO;
import com.springapi.entity.ErrorModel;
import com.springapi.entity.User;
import com.springapi.exception.RequestedResourceNotFound;
import com.springapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class UserController {
    @Autowired
    private UserService UserServiceObject;

    @RequestMapping(value = "/User", method = RequestMethod.GET)
    public ResponseEntity<List<User>> GetUsers() {
        return new ResponseEntity<List<User>>(UserServiceObject.GetUsers(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/User/{Id}", method = RequestMethod.GET)
    public ResponseEntity<User> GetUser(@PathVariable(name = "Id") int Id) {
        return new ResponseEntity<User>(UserServiceObject.GetUser(Id), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/User", method = RequestMethod.POST)
    public ResponseEntity<User> AddUser(@RequestBody UserDTO UserDetails) {
        return new ResponseEntity<User>(UserServiceObject.SaveUser(UserDetails), HttpStatus.ACCEPTED);
    }

}