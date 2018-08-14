package com.westos.paixu.maopao;

import java.util.Arrays;

public class maopao1 {
    public static void main(String[] args) {
        int[] array = {5,8,6,4,3,9,2,1,7};
        paixu1(array);
        System.out.println(Arrays.toString(array));

    }
    //最简单的冒泡排序法
    //外层控制所有回合，内层控制每一次的循环处理
    public static void paixu1(int array[]){

       int tem = 0;

       for(int i=0;i<array.length;i++){

           for(int j=0;j<array.length-i-1;j++){

               if(array[j]>array[j+1]){

                   tem = array[j];
                   array[j] = array[j+1];
                   array[j+1] = tem;
               }
           }
       }
    }
}
