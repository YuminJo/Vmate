package com.myvirtual.vmate.domain.post.post.service;

import com.myvirtual.vmate.domain.member.member.entity.Member;
import com.myvirtual.vmate.domain.post.post.entity.Post;
import com.myvirtual.vmate.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public void write(Member author, String title, String content, boolean published) {
        Post post = Post.builder()
                .author(author)
                .title(title)
                .content(content)
                .published(published)
                .build();
        postRepository.save(post);
    }
}
