package com.xuxu.spring.service.impl;

import com.xuxu.spring.entity.Article;
import com.xuxu.spring.mapper.ArticleMapper;
import com.xuxu.spring.service.IArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
