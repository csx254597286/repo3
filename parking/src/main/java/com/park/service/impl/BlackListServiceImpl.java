package com.park.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.park.entity.BlackList;
import com.park.mapper.BlackListMapper;
import com.park.service.BlackListService;
import org.springframework.stereotype.Service;

@Service
public class BlackListServiceImpl extends ServiceImpl<BlackListMapper,BlackList> implements BlackListService {
}
