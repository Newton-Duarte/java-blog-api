package com.newtonduarte.blog_api.mappers;


import com.newtonduarte.blog_api.domain.CreatePostRequest;
import com.newtonduarte.blog_api.domain.UpdatePostRequest;
import com.newtonduarte.blog_api.domain.dtos.CreatePostRequestDto;
import com.newtonduarte.blog_api.domain.dtos.PostDto;
import com.newtonduarte.blog_api.domain.dtos.UpdatePostRequestDto;
import com.newtonduarte.blog_api.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {
    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    PostDto toDto(Post post);
    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);
    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);
}
