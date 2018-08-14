package com.westos.paixu.jiweijiu;

import java.util.Arrays;
//鸡尾酒排序,最适合于大部分元素已经有序时
public class jiweijiu1 {
    public static void main(String[] args) {

        //int[] array = {2,3,4,5,6,7,8,1};
        //int[] array = {5,8,6,4,3,9,2,1,7};
        int[] array = {5,8,6,4,10,3,9,2,11,1,7,12};
        paixu1(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length/2-1);
    }
    public static void paixu1(int array[]){
        int tem = 0;
        for(int i=0;i<array.length/2-1;i++){
            boolean isyouxu = true;
            //奇数轮从左往右
            for(int j=i;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;
                    isyouxu = false;
                }
            }
            if(isyouxu){
                break;
            }
            //偶数轮从右往左
            for(int j=array.length-i-1;j>i;j--){
                if(array[j]<array[j-1]){
                    tem = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tem;
                    isyouxu = false;
                }
            }
            if(isyouxu){
                break;
            }
        }

    }

}
