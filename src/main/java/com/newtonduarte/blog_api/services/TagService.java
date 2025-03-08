package com.newtonduarte.blog_api.services;

import com.newtonduarte.blog_api.domain.entities.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getTags();
}
