package com.ys.mybatisMapperScan.mapper;

import com.ys.mybatisMapperScan.entity.Test;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {

    @Select("select * from t_test where id = #{id}")
    Test selectById(int id);
}
