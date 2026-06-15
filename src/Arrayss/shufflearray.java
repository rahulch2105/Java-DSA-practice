package Arrayss;
import java.util.*;
public class shufflearray {
        public int[] shuffle( ) {
            int nums[]={2,5,1,3,4,7};
            int n=nums.length/2;
            int arr[]=new int[2*n];
            int j=0;
            for(int i=0;i<n;i++){
                arr[j++]=nums[i];
                arr[j++]=nums[i+n];

            }
            return arr;
        }

    public static void main(String[] args) {

        shufflearray n=new shufflearray();
        System.out.println(Arrays.toString(n.shuffle()));
    }
    }