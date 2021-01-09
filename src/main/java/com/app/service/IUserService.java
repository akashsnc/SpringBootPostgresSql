package com.app.service;

import com.app.entity.User;

public interface IUserService {
    User registerNewUser(User newUser);
    User loginUser(User userDto);
}
