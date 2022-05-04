package com.xuxu.spring.service.impl;

import com.xuxu.spring.entity.User;
import com.xuxu.spring.mapper.UserMapper;
import com.xuxu.spring.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
