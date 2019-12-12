import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode *
 * @classname: T412 *
 * @author: lnback *
 * @create: 2019-12-12 14:18
 **/

public class T412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0){
                sb.append("Fizz");
            }
            if(i % 5 == 0){
                sb.append("Buzz");
            }
            if(i % 3 !=0 && i % 5 !=0){
                sb.append(i);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}
