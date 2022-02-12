package com.example.composeapi.controller;

import com.example.composeapi.model.Friends;
import com.example.composeapi.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ServerAPI {

    @Autowired
    private FriendService friendService;

    @GetMapping("/friends")
    public List<Friends> getAll(){
        return friendService.allFriends();
    }
}
