package com.example.graphql;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
class PostService {
    private final Map<String, Post> posts = new HashMap<>();

    public Collection<Post> createPost(String content) {
        Post newPost = new Post(UUID.randomUUID().toString(), content);
        posts.put(newPost.id(), newPost);
        return posts.values();
    }

    public Post postById(String id) {
        return posts.get(id);
    }
}

@Service
class CommentService {
    private final Map<String, Comment> comments = new HashMap<>();

    public Collection<Comment> createComment(String content, String postId) {
        Comment newComment = new Comment(UUID.randomUUID().toString(), content, postId);
        comments.put(newComment.id(), newComment);
        return comments.values();
    }

    public Collection<Comment> findByPostId(String postId) {
        return comments.values()
                .stream()
                .filter(comment -> comment.postId().equals(postId))
                .toList();
    }
}