package com.newtonduarte.blog_api.services;

import com.newtonduarte.blog_api.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
