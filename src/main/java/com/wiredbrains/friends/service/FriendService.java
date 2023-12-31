package com.wiredbrains.friends.service;

import com.wiredbrains.friends.model.Friend;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FriendService extends CrudRepository<Friend, Integer> {
    Iterable<Friend> findByFirstNameAndLastName(String firstName, String lastName);
    Iterable<Friend> findByFirstName(String firstName);
    Iterable<Friend> findByLastName(String lastName);
}
