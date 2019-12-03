/**
 * @program: LeetCode *
 * @classname: T204 *
 * @author: lnback *
 * @create: 2019-11-28 19:05
 **/

public class T204 {
    public int countPrimes(int n) {
        if(n <= 1){
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        int ans = 0;
        for(int i = 2;i < n;i++){
            if(isPrime[i] == false){
                ans++;
                for(int j = 2;j * i < n;j++){
                    isPrime[j * i] = true;
                }
            }
        }
        return ans;
    }
}
