package main.java.com.astral;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int oriArray[] = {4, 5, 6, 1, 3, 2};
        int length = oriArray.length;
        insertSort(oriArray,length);
    }

    //快速排序。将要排序的数组分为两个部分，一个部分是已排序，一个部分未排序
    //每次从未排序中取出一个，循环全部已排序的，将其插入到合适的位置
    private static void insertSort(int oriArray[], int length){
        int resultArray[] = new int[length];
        resultArray[0] = oriArray[0];
        for(int i = 1; i < oriArray.length; i++){
            for(int j = i - 1; j >= 0;j--){
                if(oriArray[i] <= resultArray[j]){
                    resultArray[j+1] = resultArray[j];
                    resultArray[j] = oriArray[i];
                }else{
                    resultArray[j+1] = oriArray[i];
                    break;
                }
            }
        }
        for(int j = 0; j < resultArray.length;j++){
            System.out.println(resultArray[j]);
        }
    }
}
