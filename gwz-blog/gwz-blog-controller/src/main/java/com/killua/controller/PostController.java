package com.killua.controller;

import com.killua.blog.dto.BlogPostDTO;
import com.killua.blog.service.PostService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author wangzhiyong
 * @date 2017/9/15
 */
public class PostController {

    @Resource
    private PostService postService;

    @RequestMapping("/post/{postId}")
    public BlogPostDTO getPostByPostId(@PathVariable long postId){
        BlogPostDTO blogPostDTO = postService.selectPostByPostId(postId);
        return blogPostDTO;
    }
}
