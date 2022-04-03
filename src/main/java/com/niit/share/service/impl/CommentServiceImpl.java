package com.niit.share.service.impl;

import com.niit.share.entity.Comment;
import com.niit.share.mapper.CommentMapper;
import com.niit.share.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getAll() {
        return commentMapper.getAll();
    }

    @Override
    public List<Comment> getPages(Integer userId, String key) {
        return commentMapper.getPages(userId, key);
    }

    @Override
    public Comment getCommentById(Integer id) {
        return commentMapper.getCommentById(id);
    }

    @Override
    public List<Comment> getCommentListById(Integer id) {
        return commentMapper.getCommentListById(id);
    }
}
