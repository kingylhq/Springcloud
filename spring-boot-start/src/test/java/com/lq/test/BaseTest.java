package com.lq.test;

import com.lq.SpringBootStartApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * hunit测试父类
 * liqian
 * 2018年10月11日15:34:08
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootStartApplication.class)
public class BaseTest {

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }



}
