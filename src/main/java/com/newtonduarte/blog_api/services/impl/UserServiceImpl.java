package com.newtonduarte.blog_api.services.impl;

import com.newtonduarte.blog_api.domain.entities.User;
import com.newtonduarte.blog_api.repositories.UserRepository;
import com.newtonduarte.blog_api.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User getUserById(UUID id) {
        return userRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));
    }
}
