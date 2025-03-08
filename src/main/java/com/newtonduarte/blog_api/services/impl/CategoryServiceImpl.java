package com.newtonduarte.blog_api.services.impl;

import com.newtonduarte.blog_api.domain.entities.Category;
import com.newtonduarte.blog_api.repositories.CategoryRepository;
import com.newtonduarte.blog_api.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }
}
