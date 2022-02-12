package com.example.composeapi.service;

import com.example.composeapi.model.Friends;
import com.example.composeapi.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    private FriendRepository repository;


    public List<Friends> allFriends(){
        return repository.findAll();
    }
}
