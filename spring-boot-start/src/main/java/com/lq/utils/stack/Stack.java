package com.lq.utils.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * ArrayList简单实现栈的原理，先 进 后 出 （LIFO）
 *
 * @author: liqian
 * @Date: 2019-03-13
 * @Time: 16:11
 * 人求上进先读书
 */
public class Stack<T> {

    List<T> list = new ArrayList<>();

    /**
     * 入栈
     * @param t
     */
    public void push(T t) {
        list.add(t);
    }

    /**
     * 出栈
     */
    public void pop() {
        Integer index = list.size() - 1;
        System.out.println(index);
        System.out.println("出栈");
        list.remove(list.size() - 1);
    }

    /**
     * 查找栈顶元素
     * @return
     */
    public T peek(){
        if (list != null && list.size() > 0) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    /**
     * 栈大小
     * @return
     */
    public Integer size() {
        return list != null && list.size() > 0 ? list.size() : 0;
    }
}
