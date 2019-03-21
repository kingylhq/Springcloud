package com.lq.utils.stack;

import com.lq.utils.test.Person;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-13
 * @Time: 16:22
 * 人求上进先读书
 */
public class TestStatic {

    public static void main(String[] args) {

        Stack<Person> stack = new Stack<>();

        stack.push(new Person("李谦", 25, "Java高级架构师"));
        stack.push(new Person("杨红", 25, "销售总监"));
        stack.push(new Person("张飞", 46, "五虎上将"));

        while (stack.size() > 0) {

            stack.pop();
        }


    }
}
