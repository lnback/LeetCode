import java.rmi.MarshalledObject;
import java.util.*;

/**
 * @program: LeetCode *
 * @classname: T383 *
 * @author: lnback *
 * @create: 2019-12-09 15:06
 **/

public class T383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<ransomNote.length();i++){
            char cur = ransomNote.charAt(i);
            if(!map.containsKey(cur)){
                map.put(cur,1);
            }else {
                map.put(cur,map.get(cur) + 1);
            }
        }
        int ans = ransomNote.length();
        for(int i = 0;i<magazine.length();i++){
            char cur = magazine.charAt(i);
            if(map.containsKey(cur) && map.get(cur) - 1 >= 0){
                map.put(cur,map.get(cur) - 1);
                ans--;
            }
        }
        return ans == 0;
    }
}
