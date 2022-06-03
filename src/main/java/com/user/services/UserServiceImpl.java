package com.user.services;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    List<User> list=List.of(
            new User(12L,"sushruth","93980"),
            new User(13L,"mami","1312199"),
            new User(14L,"ramya","9391380"),
            new User(15L,"bindu","81281928")
    );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
