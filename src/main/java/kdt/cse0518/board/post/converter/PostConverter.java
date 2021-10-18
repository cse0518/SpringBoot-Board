package kdt.cse0518.board.post.converter;

import kdt.cse0518.board.post.dto.PostDto;
import kdt.cse0518.board.post.dto.RequestDto;
import kdt.cse0518.board.post.dto.ResponseDto;
import kdt.cse0518.board.post.entity.Post;
import org.springframework.stereotype.Component;

@Component
public class PostConverter {

    public PostDto toPostDto(final Post post) {
        return PostDto.builder()
                .postId(post.getPostId())
                .title(post.getTitle())
                .content(post.getContent())
                .createdAt(post.getCreatedAt())
                .modifiedAt(post.getModifiedAt())
                .modifiedBy(post.getModifiedBy())
                .user(post.getUser())
                .build();
    }

    public RequestDto toRequestDto(final PostDto postDto) {
        return RequestDto.builder()
                .postId(postDto.getPostId())
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .createdAt(postDto.getCreatedAt())
                .modifiedAt(postDto.getModifiedAt())
                .build();
    }

    public ResponseDto toResponseDto(final PostDto postDto) {
        return ResponseDto.builder()
                .postId(postDto.getPostId())
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .build();
    }

//
//    public Post toPost(final PostDto postDto) {
//        return Post.builder()
//                .postId(postDto.getPostId())
//                .title(postDto.getTitle())
//                .content(postDto.getContent())
//                .createdAt(postDto.getCreatedAt())
//                .modifiedAt(postDto.getModifiedAt())
//                .modifiedBy(postDto.getModifiedBy())
//                .user(postDto.getUser())
//                .build();
//    }
}