package com.blogsphere.blogsphere.controller;

import com.blogsphere.blogsphere.entity.Comment;
import com.blogsphere.blogsphere.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
    
    @GetMapping("/posts/{postId}/addComment")
    public String addCommentForm(@PathVariable Long postId, Model model) {
        model.addAttribute("comment", new Comment());
        model.addAttribute("postId", postId);
        return "createComment";
    }
    
    @PostMapping("/posts/{postId}/addComment")
    public String addComment(@ModelAttribute Comment comment, @PathVariable Long postId, Model model) {
        Comment response = commentService.addComment(comment, postId);
        model.addAttribute("message", "Comment created successfully. Id -> " + response.getId());
        return "redirect:/getPost/" + postId;
    }

    /*
    @PostMapping("/posts/{id}/addComment")
    public String addComment(@ModelAttribute Comment comment, @PathVariable Long id) {
        commentService.addComment(comment, id);
        return "redirect:/getPost/" + id;
    }
*/
    @GetMapping("/editComment/{commentId}")
    public String editCommentForm(@PathVariable Long commentId, Model model) {
        Comment comment = commentService.getCommentByCommentId(commentId);
        model.addAttribute("comment", comment);
        return "editComment";
    }

    @PostMapping("/post/{postId}/comment/{commentId}")
    public String updateComment(@PathVariable Long postId, @PathVariable Long commentId, @ModelAttribute Comment comment) {
        commentService.updateCommentByCommentId(commentId, postId, comment);
        return "redirect:/getPost/" + postId;
    }

    @PostMapping("/deleteComment/{id}")
    public String deleteComment(@PathVariable Long id) {
        Comment comment = commentService.getCommentByCommentId(id);
        if (comment != null) {
            Long postId = comment.getPost().getId();
            commentService.deleteCommentByCommentId(id);
            return "redirect:/getPost/" + postId;
        }
        return "redirect:/";
    }
}

