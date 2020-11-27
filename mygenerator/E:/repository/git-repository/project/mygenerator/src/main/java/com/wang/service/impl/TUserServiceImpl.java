package com.wang.service.impl;

import com.wang.entity.TUser;
import com.wang.mapper.TUserMapper;
import com.wang.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanghcao
 * @since 2020-11-26
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
