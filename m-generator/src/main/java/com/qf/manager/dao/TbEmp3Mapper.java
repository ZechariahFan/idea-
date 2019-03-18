package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbEmp3;
import com.qf.manager.pojo.po.TbEmp3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEmp3Mapper {
    int countByExample(TbEmp3Example example);

    int deleteByExample(TbEmp3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbEmp3 record);

    int insertSelective(TbEmp3 record);

    List<TbEmp3> selectByExample(TbEmp3Example example);

    TbEmp3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbEmp3 record, @Param("example") TbEmp3Example example);

    int updateByExample(@Param("record") TbEmp3 record, @Param("example") TbEmp3Example example);

    int updateByPrimaryKeySelective(TbEmp3 record);

    int updateByPrimaryKey(TbEmp3 record);
}