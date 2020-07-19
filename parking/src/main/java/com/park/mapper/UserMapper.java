package com.park.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.park.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
