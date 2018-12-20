package com.seadog.reddit.services;

import com.seadog.reddit.models.Post;
import com.seadog.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public PostService() {
    }


    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    public List<Post> findTop10ByOrderByRatingDesc(){
        return postRepository.findTop10ByOrderByRatingDesc();
    }


    public void save(Post post) {
        postRepository.save(post);
    }

    public Post getById(Long id) {
        return postRepository.findById(id).get();
    }

    public void like(Long id) {
        Post post = getById(id);
        post.setRating(post.getRating() + 1);
        postRepository.save(post);
    }

    public void dislike(Long id) {
        if (getById(id).getRating() > 0) {
            Post post = getById(id);
            post.setRating(post.getRating() - 1);
            postRepository.save(post);
        }
    }
}
