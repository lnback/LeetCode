import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    //二分加搜索
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- != 0){

            int ans = 0;
            int n = scanner.nextInt();
            int[] nums = new int[n];
            int[] visited = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++){
                nums[i] = scanner.nextInt();
                sum += nums[i];
            }
            Arrays.sort(nums);
            int left = 0,right = nums[n-1];
            while (left < right){
                int mid = right;
                if(Judge(mid,nums,visited,0,0,0)){
                    ans = mid;
                    System.out.println(mid);
                    break;
                }else {
                    System.out.println("else : " + mid);
                    right = mid - 1;
                }
            }
            System.out.println(ans);
        }



    }

    private static boolean Judge(int temp,int[] nums,int[] visited,int index,int cnt,int sum) {
        if(cnt == 2){
            return true;
        }
        if(index == nums.length){
            return cnt == 2;
        }
        for(int i = index; i < nums.length; i++){

            if(visited[i] == 0){
                sum += nums[i];
            }
            visited[i] = 1;
            if(sum == temp){
                cnt ++;
                if(cnt == 2){
                    return true;
                }else {
                    sum = 0;
                }
            }
            Judge(temp,nums,visited,i + 1,cnt,sum);
            visited[i] = 0;
        }
        return false;
    }
}
