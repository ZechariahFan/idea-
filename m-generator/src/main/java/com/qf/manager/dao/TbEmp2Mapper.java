package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbEmp2;
import com.qf.manager.pojo.po.TbEmp2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEmp2Mapper {
    int countByExample(TbEmp2Example example);

    int deleteByExample(TbEmp2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbEmp2 record);

    int insertSelective(TbEmp2 record);

    List<TbEmp2> selectByExample(TbEmp2Example example);

    TbEmp2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbEmp2 record, @Param("example") TbEmp2Example example);

    int updateByExample(@Param("record") TbEmp2 record, @Param("example") TbEmp2Example example);

    int updateByPrimaryKeySelective(TbEmp2 record);

    int updateByPrimaryKey(TbEmp2 record);
}