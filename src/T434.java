/**
 * @program: LeetCode *
 * @classname: T434 *
 * @author: lnback *
 * @create: 2019-12-12 15:53
 **/

public class T434 {
    public int countSegments(String s) {
        String[] ans = s.split(" ");
        int cnt = 0;
        for(String str : ans){
            if(!"".equals(str)){
                cnt ++;
            }
        }
        return cnt;
    }
}
