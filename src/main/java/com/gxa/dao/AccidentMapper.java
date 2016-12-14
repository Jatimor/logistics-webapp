package com.gxa.dao;

import com.gxa.domain.Accident;

public interface AccidentMapper {
    int deleteByPrimaryKey(String no);

    int insert(Accident record);

    int insertSelective(Accident record);

    Accident selectByPrimaryKey(String no);

    int updateByPrimaryKeySelective(Accident record);

    int updateByPrimaryKey(Accident record);
}