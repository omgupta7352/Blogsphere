package com.blogsphere.blogsphere.controller;

import com.blogsphere.blogsphere.entity.Post;
import com.blogsphere.blogsphere.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;
    
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    
    @GetMapping("/view")
    public String view(Model model) {
        List<Post> posts = postService.getAllPost();
        model.addAttribute("posts", posts);
        return "view";
    }
    
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }


    @GetMapping("/createPost")
    public String createPostForm() {
        return "createPost";
    }

    @PostMapping("/createPost")
    public String createPost(@ModelAttribute Post post) {
        postService.createPost(post);
        return "redirect:/";
    }

    @GetMapping("/getPost/{id}")
    public String getPostById(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "post";
    }

    @GetMapping("/editPost/{id}")
    public String editPostForm(@PathVariable Long id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "editPost";
    }

    @PostMapping("/updatePost/{id}")
    public String updatePost(@PathVariable Long id, @ModelAttribute Post post) {
        postService.updatePostById(post, id);
        return "redirect:/getPost/" + id;
    }

    @PostMapping("/deletePost/{id}")
    public String deletePost(@PathVariable Long id) {
        postService.deletePostById(id);
        return "redirect:/";
    }
}

