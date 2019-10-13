package com.punk;

public class Selection<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        for(int i = 0;i<N-1;i++){
            int min = i;
            for(int j = i+1;j<N-1;j++){ //比较N-1次
                //nums[j] 小于nums[min]
                if(less(nums[j],nums[min])){
                    min = j;
                }
            }

            swap(nums,i,min);
        }
    }
}
