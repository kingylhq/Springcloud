package com.lq.test;

import com.lq.mapper.UserMapper;
import com.lq.model.UserInfo;
import com.lq.service.IUserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-10
 * @Time: 22:47
 * 人求上进先读书
 */


public class UserMapperTest extends BaseTest {

    @Resource
    IUserService service;

    @Test
    public void selectAllTest() {
        List<UserInfo> userInfos = service.selectAll(new HashMap<>());
        System.out.println("返回结合大小"+userInfos.size());
    }


}
