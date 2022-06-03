package com.user.services;

import com.user.entity.User;
import org.springframework.stereotype.Component;

public interface UserService {
    public User getUser(Long id);
}
