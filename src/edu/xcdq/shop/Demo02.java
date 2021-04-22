package edu.xcdq.shop;

import java.util.Arrays;

/**
 * @author hongxiaozheng
 * @date 2021/4/8 15:36
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] a = {1 , 55 , 94 , 2 , 31 , 80 , 14 ,0 ,72, 189 , 393 , 30808 ,28 ,32 ,818,404 };
        int count = 0;
        int jiaohuan = 0;
        System.out.println("原始数组为：" + Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {    //7   0((n-1)*(n-1)) = n^2
                if (a[j] > a[j + 1]){
                    System.out.println(a[j] + "和" + a[j+1] + "交换位置了");

                    a[j] = a[j] ^ a[j+1];
                    a[j+1] = a[j] ^ a[j+1];
                    a[j] = a[j] ^ a[j+1];
                    System.out.println("交换完后为：" + Arrays.toString(a));
                    jiaohuan ++;
                }
                count ++ ;
            }
        }
        System.out.println("共进行了：" + count + "轮排序" + jiaohuan + "轮交换");




    }
}
