import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode *
 * @classname: T205 *
 * @author: lnback *
 * @create: 2019-11-26 21:12
 **/

public class T205 {
    /**
     * 使用Map<Character,Character>保存映射关系
     * 1. 如果map中不包含s[i],则也不包含t[i]
     * 2. 如果map中含有s[i]，则对比以s[i]为键的entry中的值是否为t[i]
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }else {
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

}
