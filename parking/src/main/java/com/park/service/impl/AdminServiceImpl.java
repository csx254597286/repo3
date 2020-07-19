package com.park.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.park.entity.Admin;
import com.park.mapper.AdminMapper;
import com.park.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
