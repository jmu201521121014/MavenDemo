package com.javen.MavenDemo.dao;

import com.javen.MavenDemo.bean.Submit;
import com.javen.MavenDemo.bean.SubmitExample;
import com.javen.MavenDemo.bean.SubmitKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubmitMapper {
    long countByExample(SubmitExample example);

    int deleteByExample(SubmitExample example);

    int deleteByPrimaryKey(SubmitKey key);

    int insert(Submit record);

    int insertSelective(Submit record);

    List<Submit> selectByExample(SubmitExample example);

    Submit selectByPrimaryKey(SubmitKey key);

    int updateByExampleSelective(@Param("record") Submit record, @Param("example") SubmitExample example);

    int updateByExample(@Param("record") Submit record, @Param("example") SubmitExample example);

    int updateByPrimaryKeySelective(Submit record);

    int updateByPrimaryKey(Submit record);
}