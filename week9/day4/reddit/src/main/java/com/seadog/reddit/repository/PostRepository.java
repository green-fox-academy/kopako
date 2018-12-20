package com.seadog.reddit.repository;

import com.seadog.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAll();

    List<Post> findTop10ByOrderByRatingDesc();
}
