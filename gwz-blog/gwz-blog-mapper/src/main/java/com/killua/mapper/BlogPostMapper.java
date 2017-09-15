package com.killua.mapper;

import com.killua.pojo.BlogPost;

import java.util.List;

/**
 * @author wangzhiyong
 * @date 2017/9/15
 */
public interface BlogPostMapper {
    List<BlogPost> selectByAuthorId(long authorId);
    BlogPost selectByPostId(long postId);
}
