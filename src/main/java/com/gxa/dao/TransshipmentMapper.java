package com.gxa.dao;

import com.gxa.domain.Transshipment;

public interface TransshipmentMapper {
    int deleteByPrimaryKey(String company);

    int insert(Transshipment record);

    int insertSelective(Transshipment record);

    Transshipment selectByPrimaryKey(String company);

    int updateByPrimaryKeySelective(Transshipment record);

    int updateByPrimaryKey(Transshipment record);
}