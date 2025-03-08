package com.newtonduarte.blog_api.controllers;

import com.newtonduarte.blog_api.domain.dtos.TagResponse;
import com.newtonduarte.blog_api.domain.entities.Tag;
import com.newtonduarte.blog_api.mappers.TagMapper;
import com.newtonduarte.blog_api.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;
    private final TagMapper tagMapper;


    @GetMapping
    public ResponseEntity<List<TagResponse>> getTags() {
        List<Tag> tags = tagService.getTags();
        List<TagResponse> tagsResponse = tags.stream().map(tagMapper::toTagResponse).toList();

        return ResponseEntity.ok(tagsResponse);
    }

}
