package com.newtonduarte.blog_api.services;

import com.newtonduarte.blog_api.domain.entities.Tag;

import java.util.List;
import java.util.Set;

public interface TagService {
    List<Tag> getTags();
    List<Tag> createTags(Set<String> tagNames);
}
