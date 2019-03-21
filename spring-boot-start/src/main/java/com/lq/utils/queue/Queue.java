package com.lq.utils.queue;


/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 *  实现队列 Queue , 先 进 先 出 (FIFO)
 *  删除必须放在队首，插入必须放在队尾
 *
 * @author: liqian
 * @Date: 2019-03-13
 * @Time: 16:37
 * 人求上进先读书
 */
public class Queue<T> {

    // 队首，只能删除
    private Integer fron;

    // 对尾，只能插入
    private Integer end;

    // 存储数据节点
    private Object[] elementData;

    // 最大容量
    private Integer max_size = 16;

    public Queue() {
        this(10);

    }

    public Queue(int initialSize) {
        this.fron = 0;
        this.end = 0;
        this.max_size = initialSize;
        // 初始则指定容器大小
        this.elementData = new Object[initialSize];
    }


    /**
     * 入队列
     * @param t
     * @return
     */
    public boolean push(T t) {
        if (end == max_size) {
            throw new RuntimeException("队列满了");
        } else {
            elementData[end++] = t;
            return true;
        }
    }

    /**
     * 出队列
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        } else {
            T t = (T)elementData[fron];
            System.out.println("队列："+t);
            elementData[fron++] = null;
            return t;
        }
    }

    /**
     * 返回队首元素
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) elementData[fron];
        }
    }

    /*
     *  队列现有数据大小
     */
    public Integer size() {
        return end - fron;
    }

    /**
     * 判断为空
     * @return
     */
    public boolean isEmpty() {
        return fron == end ? true : false;
    }

}
