package com.lq.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-11
 * @Time: 12:40
 * 人求上进先读书
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     *
     * @return
     */
    @GetMapping ("/login")
    @ApiImplicitParam(name="id", value="用户ID", required=true, dataType="String")
    @ApiModelProperty(value = "用户登录")
    public String login() {
        logger.info("执行用户登录操作开始,记录日志");

        List list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        return "登录成功999";
    }


    @GetMapping ("/errorPage")
    @ApiModelProperty(value = "错误页面")
    public String errorPage() {
        return "出错啦，您访问的页面不存在";
    }
}
