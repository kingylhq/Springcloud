package com.lq.utils.zuhe;

/**
 * 鸟欲高飞先振翅
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: liqian
 * @Date: 2019-03-18
 * @Time: 12:31
 * 人求上进先读书
 */
public class Zuhe {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int m = 0;
        int[] strs =new int[]{1,2,3};
        while(m < 3) {
            int i = (int) (Math.random() * 10);
            int n = i % 4;
            strs[m] = n;
        }
    }
}
