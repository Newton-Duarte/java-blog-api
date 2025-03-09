package com.newtonduarte.blog_api.services;

import com.newtonduarte.blog_api.domain.CreatePostRequest;
import com.newtonduarte.blog_api.domain.UpdatePostRequest;
import com.newtonduarte.blog_api.domain.entities.Post;
import com.newtonduarte.blog_api.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
}
