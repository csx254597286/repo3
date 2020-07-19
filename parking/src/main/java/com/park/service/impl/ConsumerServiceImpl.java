package com.park.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.park.entity.Consume;
import com.park.mapper.ConsumeMapper;
import com.park.service.ConsumeService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl extends ServiceImpl<ConsumeMapper, Consume> implements ConsumeService {
}
