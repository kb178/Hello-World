package com.xuxu.spring.service.impl;

import com.xuxu.spring.entity.Comment;
import com.xuxu.spring.mapper.CommentMapper;
import com.xuxu.spring.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 许海林
 * @since 2022-05-01
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
