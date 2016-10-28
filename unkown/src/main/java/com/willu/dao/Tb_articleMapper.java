package com.willu.dao;

import com.willu.model.Tb_article;

public interface Tb_articleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tb_article record);

    int insertSelective(Tb_article record);

    Tb_article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tb_article record);

    int updateByPrimaryKey(Tb_article record);
}