package com.newtonduarte.blog_api.services;

import com.newtonduarte.blog_api.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
}
