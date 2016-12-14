package com.gxa.dao;

import com.gxa.domain.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}