package com.javen.MavenDemo.dao;

import com.javen.MavenDemo.bean.Examine;
import com.javen.MavenDemo.bean.ExamineExample;
import com.javen.MavenDemo.bean.ExamineKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamineMapper {
    long countByExample(ExamineExample example);

    int deleteByExample(ExamineExample example);

    int deleteByPrimaryKey(ExamineKey key);

    int insert(Examine record);

    int insertSelective(Examine record);

    List<Examine> selectByExample(ExamineExample example);

    Examine selectByPrimaryKey(ExamineKey key);

    int updateByExampleSelective(@Param("record") Examine record, @Param("example") ExamineExample example);

    int updateByExample(@Param("record") Examine record, @Param("example") ExamineExample example);

    int updateByPrimaryKeySelective(Examine record);

    int updateByPrimaryKey(Examine record);
}