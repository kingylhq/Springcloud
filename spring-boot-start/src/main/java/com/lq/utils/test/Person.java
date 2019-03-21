package com.lq.utils.test;

import java.util.Objects;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description: Person对象
 *
 * @author: liqian
 * @Date: 2019-03-13
 * @Time: 16:09
 * 人求上进先读书
 */
public class Person {

    private String name;

    private Integer age;

    private String work;

    public Person() {

    }

    public Person(String name, Integer age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(work, person.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, work);
    }
}
