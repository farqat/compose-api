package com.example.composeapi;

import com.example.composeapi.model.Friends;
import com.example.composeapi.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ComposeApiApplication {

    @Autowired
    private FriendRepository friendRepository;

    public static void main(String[] args) {
        SpringApplication.run(ComposeApiApplication.class, args);
    }

    @PostConstruct
    public void firendInit(){
        friendRepository.save(new Friends(1, "Kindson", "Munonye", "Computer Science"));
        friendRepository.save(new Friends(2, "Komla", "Agudze", "Economics"));
        friendRepository.save(new Friends(3, "Helena", "Grunden", "Gardening"));
        friendRepository.save(new Friends(4, "Anita", "Wilfred", "Social Working"));
        friendRepository.save(new Friends(5, "Ruth", "Untertep", "Medicine"));
        friendRepository.save(new Friends(6, "Nicholas", "Horvath", "Biology Teaching"));
    }


}
