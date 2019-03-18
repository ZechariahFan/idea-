package com.qf.manager.dao;

import com.qf.manager.pojo.po.TbEmp1;
import com.qf.manager.pojo.po.TbEmp1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEmp1Mapper {
    int countByExample(TbEmp1Example example);

    int deleteByExample(TbEmp1Example example);

    int insert(TbEmp1 record);

    int insertSelective(TbEmp1 record);

    List<TbEmp1> selectByExample(TbEmp1Example example);

    int updateByExampleSelective(@Param("record") TbEmp1 record, @Param("example") TbEmp1Example example);

    int updateByExample(@Param("record") TbEmp1 record, @Param("example") TbEmp1Example example);
}