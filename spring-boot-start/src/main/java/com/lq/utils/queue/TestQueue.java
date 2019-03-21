package com.lq.utils.queue;

import com.lq.utils.test.Person;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-13
 * @Time: 17:00
 * 人求上进先读书
 */
public class TestQueue {

    public static void main(String[] args) {

        Queue<Person> queue = new Queue<>(10);
        Person person1 = new Person("李刚", 28, "白领");
        Person person2 = new Person("杜林", 19, "测试");
        Person person3 = new Person("张雨绮", 36, "偷人");

        System.out.println("person1 ："+person1);
        System.out.println("person2 ："+person2);
        System.out.println("person3 ："+person3);
        System.out.println("*****************************************************");
        queue.push(person1);
        queue.push(person2);
        queue.push(person3);

        // 队列数据大小
        Integer size = queue.size();

        for (int i = 0; i < size; i++) {
                queue.pop();
        }


    }

}
