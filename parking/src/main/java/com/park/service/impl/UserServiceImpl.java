package com.park.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.park.entity.User;
import com.park.mapper.UserMapper;
import com.park.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
