package Arrayss;

import java.util.*;

public class arrayconcatenation {
    public static void main(String[] args) {
        int nums[]={1,2,1};
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
