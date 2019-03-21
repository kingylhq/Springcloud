package com.lq.mapper;

import com.lq.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 用户Mapper
 * 增删改查操作
 * @author 李谦
 * 2018年10月17日17:25:39
 */

public interface UserMapper {

//    int add(UserInfo userInfo) throws Exception;
//
//    int updateById(UserInfo userInfo) throws  Exception;
//
//    List<UserInfo> selectByPrimaryKey(@Param(value = "userId") Integer userId);

    List<UserInfo> selectAll(@Param("param") Map<String, Object> map);

//    int deleteById(List<String> ids);
}
