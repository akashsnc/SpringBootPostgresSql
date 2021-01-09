package com.app.service;

import com.app.entity.User;
import com.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User registerNewUser(User newUser) {
        return userRepo.save(newUser);
    }

    @Override
    public User loginUser(User userDto) {
        return userRepo.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
    }
}
