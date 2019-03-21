package com.lq.utils.set;

import com.lq.utils.test.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 *  问题：一个Person对象连续初始化三次，每次构造器设置相同的值
 *  然后将三个对象分别添加到Set集合中
 *  最后Set集合的size() 大小为多少
 *  情况一：如果对象重写了equals()和hashCode()，则Set集合大小为1
 *  情况二：没有重写那两个方法，则为3
 *
 *
 * @author: liqian
 * @Date: 2019-03-13
 * @Time: 17:04
 * 人求上进先读书
 */
public class TestSet {

    public static void main(String[] args) {

        /**
         * 1、如果重写了hashCode()和equals()，则为Set集合大小为1，否则为3
         */

        Person person1 = new Person("李刚",28, "白领");
        Person person2 = new Person("李刚",28, "白领");
        Person person3 = new Person("李刚",28, "白领");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        Set<Person> set = new HashSet<>();

        set.add(person1);
        set.add(person2);
        set.add(person3);

//        Set<String> set = new HashSet<>();

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//        set.add(str1);
//        set.add(str2);

        List<String> list = new ArrayList<>();

        System.out.println(set.size());





    }


}
