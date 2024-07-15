package com.blogsphere.blogsphere.repository;

import com.blogsphere.blogsphere.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long>  {

    public List<Comment> findByPostId(Long postId);

}