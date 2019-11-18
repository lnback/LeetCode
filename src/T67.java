/**
 * @program: LeetCode *
 * @classname: T67 *
 * @author: lnback *
 * @create: 2019-11-16 18:22
 **/

public class T67 {

    public static String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        StringBuffer sb = new StringBuffer();
        int add = 0;
        for(;blen>=0 && alen >= 0;alen--,blen--){
            add = Integer.parseInt(b.substring(blen-1,blen)) + Integer.parseInt(a.substring(alen-1,alen));
            if(add == 2){

            }
        }
        return "";
    }

}
