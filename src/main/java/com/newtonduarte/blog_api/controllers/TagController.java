package com.newtonduarte.blog_api.controllers;

import com.newtonduarte.blog_api.domain.dtos.CreateTagsRequest;
import com.newtonduarte.blog_api.domain.dtos.TagDto;
import com.newtonduarte.blog_api.domain.entities.Tag;
import com.newtonduarte.blog_api.mappers.TagMapper;
import com.newtonduarte.blog_api.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;
    private final TagMapper tagMapper;


    @GetMapping
    public ResponseEntity<List<TagDto>> getTags() {
        List<Tag> tags = tagService.getTags();
        List<TagDto> tagsResponse = tags.stream().map(tagMapper::toTagResponse).toList();

        return ResponseEntity.ok(tagsResponse);
    }

    @PostMapping
    public ResponseEntity<List<TagDto>> createTags(@RequestBody CreateTagsRequest createTagsRequest) {
        List<Tag> savedTags = tagService.createTags(createTagsRequest.getNames());
        List<TagDto> createdTagRespons = savedTags.stream().map(tagMapper::toTagResponse).toList();
        return new ResponseEntity<>(
                createdTagRespons,
                HttpStatus.CREATED
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteTag(@PathVariable UUID id) {
        tagService.deleteTag(id);
        return ResponseEntity.noContent().build();
    }
}
