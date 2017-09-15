package com.killua.blog.service.impl;

import com.killua.blog.dto.BlogPostDTO;
import com.killua.blog.service.PostService;
import com.killua.mapper.BlogPostMapper;
import com.killua.pojo.BlogPost;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhiyong
 * @date 2017/9/15
 */
public class PostServiceImpl implements PostService{

    @Resource
    private BlogPostMapper blogPostMapper;

    @Override
    public List<BlogPostDTO> selectPostByAuthorId(long authorId) {
        List<BlogPost> blogposts = blogPostMapper.selectByAuthorId(authorId);
        List<BlogPostDTO> blogPostDTOs = new ArrayList<>(blogposts.size());
        for(BlogPost blogPost:blogposts){
            BlogPostDTO blogPostDTO = new BlogPostDTO();
            BeanUtils.copyProperties(blogPost,blogPostDTO);
            blogPostDTOs.add(blogPostDTO);
        }
        return blogPostDTOs;
    }

    @Override
    public BlogPostDTO selectPostByPostId(long postId) {
        BlogPostDTO blogPostDTO = new BlogPostDTO();
        BeanUtils.copyProperties(blogPostMapper.selectByPostId(postId),blogPostDTO);
        return blogPostDTO;
    }
}
