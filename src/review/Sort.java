package review;

import javax.swing.table.TableModel;
import java.util.Arrays;

/**
 * @program: LeetCode *
 * @classname: InsertSort *
 * @author: lnback *
 * @create: 2020-07-01 15:14
 **/

public class Sort {
    public void insertSort(int[] nums){
        for(int i = 1;i < nums.length;i++){
            int insertNum = nums[i];
            int insertIndex;
            for(insertIndex = i - 1;insertIndex >= 0 && nums[insertIndex] > insertNum;insertIndex--){
                nums[insertIndex + 1] = nums[insertIndex];
            }
            nums[insertIndex + 1] = insertNum;
        }
    }

    public void shellSort(int[] nums){
        for(int d = nums.length / 2;d > 0;d /= 2){
            for(int i = d;i < nums.length;i++){
                int insertNum = nums[i];
                int insertIndex;
                for(insertIndex = i - d;insertIndex >= 0 && nums[insertIndex] > insertNum;insertIndex -= d){
                    nums[insertIndex + d] = nums[insertIndex];
                }
                nums[insertIndex + d] = insertNum;
            }
        }
    }

    public void selectSort(int[] nums){
        int minIndex;
        for(int index = 0;index < nums.length;index++){
            minIndex = index;
            for(int i = index + 1;i < nums.length;i++){
                if(nums[i] < nums[minIndex]){
                    minIndex = i;
                }
            }
            if(index != minIndex){
                int t = nums[index];
                nums[index] = nums[minIndex];
                nums[minIndex] = t;
            }
        }
    }
    public static void heapSort(int[] nums){
        //建堆
        int length = nums.length - 1;
        for(int i = 0; i < length ; i++){
            buildMaxHeap(nums,length - i);
            swap(nums,0,length - i);
        }
    }
    public static void buildMaxHeap(int[] nums,int lastIndex){
        //只需判断lastIndex / 2 - 1 ~ 0的节点即可，因为只有该范围有子节点
        for(int i = (lastIndex - 1) / 2;i>=0;i--){
            //保存正在判断的节点
            int tempIndex = i;
            //左节点并设为较大节点
            int bigIndex = 2*tempIndex+1;
            //左节点并设为较小节点s
            if(bigIndex < lastIndex){
                //判断左节点大还是右节点大
                if(nums[bigIndex] < nums[bigIndex+1]){
                    //bigIndex始终保存较大节点的下标
                    bigIndex ++;
                }
            }

            //判断父节点和子节点中的较大节点谁打，并交换。
            if(nums[tempIndex] < nums[bigIndex]){
                swap(nums,tempIndex,bigIndex);
            }
        }
    }
    public static void swap(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void quickSort(int[] nums,int start,int end){
        if(start < end){
            int index = getPivotIndex(nums,start,end);
            quickSort(nums, start , index - 1);
            quickSort(nums, index + 1 , end);
        }

    }
    public static int getPivotIndex(int nums[],int start,int end){
        int tmp = nums[start];
        while (start < end){
            while (start < end && nums[end] >= tmp) end--;
            nums[start] = nums[end];
            while (start < end && nums[start] <= tmp) start++;
            nums[end] = nums[start];
        }
        nums[start] = tmp;
        return start;
    }

    public static void bubbleSort(int[] nums){
        boolean swap;
        for(int i = 0;i< nums.length - 1;i++){
            swap = true;
            for(int index = 0;index < nums.length - 1 - i;index++){
                if(nums[index] > nums[index + 1]){
                    swap(nums,index,index+1);
                    swap = false;
                }
            }
            if(swap) break;
        }
    }
    int[] help;

    public static void mergeSort(int[] nums){
        int[] help = new int[nums.length];
        sort(nums,0,nums.length - 1);
    }

    public static void sort(int[] nums,int start,int end){
        if(start == end) return;
        int mid = start + (end - start) / 2;
        sort(nums,start,mid);
        sort(nums,mid + 1,end);
        merge(nums,start,mid,end);
    }

    private static void merge(int[] nums, int start, int mid, int end) {

    }
    public static void main(String[] args){
        int nums[] = {9,2,3,1,5,8,1};
        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    

}
