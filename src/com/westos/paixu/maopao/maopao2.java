package com.westos.paixu.maopao;

import java.util.Arrays;

public class maopao2 {

    public static void main(String[] args) {
        int[] array = {5,8,6,4,3,9,2,1,7};
        paixu2(array);
        System.out.println(Arrays.toString(array));
    }
    //冒泡排序升级1：添加一个有序判断
    // 如果有元素交换则依然是无序
    // 如果没有元素交换则是有序的，此时跳出循环
    // 主要用于解决已经有序的数列依然要循环的问题
    public static void paixu2(int array[]){
        int tem = 0;
        for(int i=0;i<array.length;i++){

            boolean isyouxu = true;

            for(int j=0;j<array.length-i-1;j++){

                if(array[j]>array[j+1]){

                    tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;

                    //这里有元素交换，则不是有序
                    isyouxu=false;
                }
            }
            //如果没有元素交换则跳出循环
            if(isyouxu){
                break;
            }
        }
    }
}
