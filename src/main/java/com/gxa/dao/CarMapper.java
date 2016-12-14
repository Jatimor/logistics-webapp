package com.gxa.dao;

import com.gxa.domain.Car;

public interface CarMapper {
    int deleteByPrimaryKey(String carId);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(String carId);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}