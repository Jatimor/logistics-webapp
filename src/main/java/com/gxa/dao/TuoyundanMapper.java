package com.gxa.dao;

import com.gxa.domain.Tuoyundan;

public interface TuoyundanMapper {
    int deleteByPrimaryKey(String no);

    int insert(Tuoyundan record);

    int insertSelective(Tuoyundan record);

    Tuoyundan selectByPrimaryKey(String no);

    int updateByPrimaryKeySelective(Tuoyundan record);

    int updateByPrimaryKey(Tuoyundan record);
}