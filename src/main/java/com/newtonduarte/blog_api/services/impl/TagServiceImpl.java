package com.newtonduarte.blog_api.services.impl;

import com.newtonduarte.blog_api.domain.entities.Tag;
import com.newtonduarte.blog_api.repositories.TagRepository;
import com.newtonduarte.blog_api.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAllWithPostCount();
    }
}
