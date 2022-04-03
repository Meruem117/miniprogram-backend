package com.niit.share.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.niit.share.base.request.PageSearchRequest;
import com.niit.share.base.response.BaseResponse;
import com.niit.share.base.response.PageResponse;
import com.niit.share.entity.Comment;
import com.niit.share.service.CommentService;
import com.niit.share.utils.ResUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Resource
    private CommentService commentService;

    @GetMapping("/all")
    public BaseResponse<List<Comment>> getAll() {
        return ResUtils.success(commentService.getAll());
    }

    @GetMapping("/list")
    public BaseResponse<PageResponse<Comment>> getPages(PageSearchRequest pageSearchRequest) {
        PageHelper.startPage(pageSearchRequest.getPage(), pageSearchRequest.getSize());
        List<Comment> list = commentService.getSearchPages(pageSearchRequest.getKey());
        Long total = ((Page) list).getTotal();
        return ResUtils.success(new PageResponse<>(list, total));
    }
}
