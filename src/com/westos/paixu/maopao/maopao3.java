package com.westos.paixu.maopao;

import java.util.Arrays;

public class maopao3 {
    public static void main(String[] args) {
          int[] array={4,2,3,1,8,7,5,6};
        //int[] array={2,1,3,4,5,6,7,8};
        paixu3(array);
        System.out.println(Arrays.toString(array));
    }
    public static void paixu3(int array[]){
        int tem = 0;
        //最后一次交换的边界
        int LastChageNum = 0;
        //无序数列的边界
        int WuXuBordor = array.length-1;
        for(int i=0;i<array.length;i++){
            boolean isyouxu = true;
            for(int j=0;j<WuXuBordor;j++){

                if(array[j]>array[j+1]){

                    tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;
                    //如果有元素交换则为false
                    isyouxu = false;

                    //把无序数列的边界更新为最后一次交换元素的位置
                    LastChageNum = j;
                    System.out.print(LastChageNum);
                }
            }
            WuXuBordor = LastChageNum;
            if(isyouxu){
                break;
            }
        }
    }
}
