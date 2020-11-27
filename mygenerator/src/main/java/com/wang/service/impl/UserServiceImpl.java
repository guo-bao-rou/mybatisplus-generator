package com.wang.service.impl;

import com.wang.entity.User;
import com.wang.mapper.UserMapper;
import com.wang.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @auther wangchao
 * @create 2020-11-26 19:09:50
 * @describe 服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
