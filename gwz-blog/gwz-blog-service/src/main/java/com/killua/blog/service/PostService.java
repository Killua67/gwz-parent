package com.killua.blog.service;

import com.killua.blog.dto.BlogPostDTO;

import java.util.List;

/**
 * @author wangzhiyong
 * @date 2017/9/15
 */
public interface PostService {
    List<BlogPostDTO> selectPostByAuthorId(long authorId);
    BlogPostDTO selectPostByPostId(long postId);
}
