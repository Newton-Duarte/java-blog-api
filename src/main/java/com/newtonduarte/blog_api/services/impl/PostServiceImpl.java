package com.newtonduarte.blog_api.services.impl;

import com.newtonduarte.blog_api.domain.PostStatus;
import com.newtonduarte.blog_api.domain.entities.Category;
import com.newtonduarte.blog_api.domain.entities.Post;
import com.newtonduarte.blog_api.domain.entities.Tag;
import com.newtonduarte.blog_api.repositories.PostRepository;
import com.newtonduarte.blog_api.services.CategoryService;
import com.newtonduarte.blog_api.services.PostService;
import com.newtonduarte.blog_api.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final CategoryService categoryService;
    private final TagService tagService;

    @Override
    @Transactional(readOnly = true)
    public List<Post> getAllPosts(UUID categoryId, UUID tagId) {
        if (categoryId != null && tagId != null) {
            Category category = categoryService.getCategoryById(categoryId);
            Tag tag = tagService.getTagById(tagId);

            return postRepository.findAllByStatusAndCategoryAndTagsContaining(
                    PostStatus.PUBLISHED,
                    category,
                    tag
            );
        }

        if (categoryId != null) {
            Category category = categoryService.getCategoryById(categoryId);
            return postRepository.findAllByStatusAndCategory(
                    PostStatus.PUBLISHED,
                    category
            );
        }

        if (tagId != null) {
            Tag tag = tagService.getTagById(tagId);
            return postRepository.findAllByStatusAndTagsContaining(
                    PostStatus.PUBLISHED,
                    tag
            );
        }

        return postRepository.findAllByStatus(PostStatus.PUBLISHED);
    }
}
