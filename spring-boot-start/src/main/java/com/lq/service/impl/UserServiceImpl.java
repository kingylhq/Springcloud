package com.lq.service.impl;

import com.lq.mapper.UserMapper;
import com.lq.model.UserInfo;
import com.lq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 19:34
 * 人求上进先读书
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UserInfo> selectAll(Map<String, Object> map) {
        return userMapper.selectAll(map);
    }
}
