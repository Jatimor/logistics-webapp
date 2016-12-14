package com.gxa.dao;

import com.gxa.domain.Station;

public interface StationMapper {
    int deleteByPrimaryKey(String sName);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(String sName);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
}