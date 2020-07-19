package com.park.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.park.entity.Park;
import com.park.mapper.ParkMapper;
import com.park.service.ParkService;
import org.springframework.stereotype.Service;

@Service
public class ParkServiceImpl extends ServiceImpl<ParkMapper, Park> implements ParkService {
}
