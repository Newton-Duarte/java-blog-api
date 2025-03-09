package com.newtonduarte.blog_api.services;

import com.newtonduarte.blog_api.domain.entities.Post;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
}
