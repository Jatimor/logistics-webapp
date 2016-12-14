package com.gxa.dao;

import com.gxa.domain.Chengyunfang;

public interface ChengyunfangMapper {
    int deleteByPrimaryKey(String name);

    int insert(Chengyunfang record);

    int insertSelective(Chengyunfang record);

    Chengyunfang selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Chengyunfang record);

    int updateByPrimaryKey(Chengyunfang record);
}