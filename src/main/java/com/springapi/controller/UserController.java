package com.springapi.controller;

import com.springapi.dto.UserDTO;
import com.springapi.entity.User;
import com.springapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class UserController {
    @Autowired
    private UserService UserServiceObject;

    @RequestMapping(value = "/User/{Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity GetUser(@PathVariable(name = "Id") int Id) {
        return new ResponseEntity(UserServiceObject.GetUser(Id), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/User", method = RequestMethod.GET)
    public ResponseEntity GetUsers() {
        return new ResponseEntity(UserServiceObject.GetUsers(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/User", method = RequestMethod.POST)
    public ResponseEntity AddUser(@RequestBody UserDTO UserDetails) {
        System.out.println(UserDetails.toString());
        return new ResponseEntity(UserServiceObject.SaveUser(UserDetails), HttpStatus.ACCEPTED);
    }
}