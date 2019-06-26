package com.javen.MavenDemo.dao;

import com.javen.MavenDemo.bean.StuclassExample;
import com.javen.MavenDemo.bean.StuclassKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuclassMapper {
    long countByExample(StuclassExample example);

    int deleteByExample(StuclassExample example);

    int deleteByPrimaryKey(StuclassKey key);

    int insert(StuclassKey record);

    int insertSelective(StuclassKey record);

    List<StuclassKey> selectByExample(StuclassExample example);

    int updateByExampleSelective(@Param("record") StuclassKey record, @Param("example") StuclassExample example);

    int updateByExample(@Param("record") StuclassKey record, @Param("example") StuclassExample example);
}