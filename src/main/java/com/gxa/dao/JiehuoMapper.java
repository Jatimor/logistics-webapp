package com.gxa.dao;

import com.gxa.domain.Jiehuo;

public interface JiehuoMapper {
    int deleteByPrimaryKey(Integer wId);

    int insert(Jiehuo record);

    int insertSelective(Jiehuo record);

    Jiehuo selectByPrimaryKey(Integer wId);

    int updateByPrimaryKeySelective(Jiehuo record);

    int updateByPrimaryKey(Jiehuo record);
}