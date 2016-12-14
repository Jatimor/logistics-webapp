package com.gxa.dao;

import com.gxa.domain.Paper;

public interface PaperMapper {
    int deleteByPrimaryKey(String tuoNo);

    int insert(Paper record);

    int insertSelective(Paper record);

    Paper selectByPrimaryKey(String tuoNo);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}