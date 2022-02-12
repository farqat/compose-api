package com.example.composeapi.repository;

import com.example.composeapi.model.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friends, Integer> {
}
