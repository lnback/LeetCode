/**
 * @program: LeetCode *
 * @classname: T345 *
 * @author: lnback *
 * @create: 2019-12-09 12:24
 **/

public class T345 {
    public String reverseVowels(String s) {
        int i = 0,j = s.length() - 1;
        char[] c = s.toCharArray();
        while (i < j){
            while (!isYuanYin(c[i]) && i < j){
                i++;
            }
            while (!isYuanYin(c[j]) && i < j){
                j--;
            }
            if(i < j){
                c[i] ^= c[j];
                c[j] ^= c[i];
                c[i] ^= c[j];
                i++;
                j--;
            }
        }
        return String.valueOf(c);
    }
    private static boolean isYuanYin(char ch){
        if(ch == 'a' || ch  == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
