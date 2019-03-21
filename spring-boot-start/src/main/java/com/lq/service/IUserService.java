package com.lq.service;

import com.lq.model.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 19:33
 * 人求上进先读书
 */
public interface IUserService {

    List<UserInfo> selectAll(Map<String, Object> map);
}
