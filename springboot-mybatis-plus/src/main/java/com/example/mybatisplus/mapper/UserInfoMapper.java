package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * 持久层接口，只需继承BaseMapper类即可
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
